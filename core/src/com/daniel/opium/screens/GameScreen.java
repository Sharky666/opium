package com.daniel.opium.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.daniel.opium.entities.Entity;
import com.daniel.opium.entities.Platform;
import com.daniel.opium.entities.Player;

import java.util.ArrayList;

public class GameScreen extends Screen {
    World world = new World(new Vector2(0, -90f), true);
    ArrayList<Entity> entities = new ArrayList<Entity>();

    public GameScreen() {
        Entity player = new Player();
        //player.setX(150f);
        player.setY(-120f);
        player.setX(-500f);
        this.addEntity(player);
        //this.addEntity(new Platform());
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
        Body body = this.world.createBody(entity.getBodyDef());

        entity.getBodyDef().position.set(150f, 150f);
        body.createFixture(entity.getFixtureDef());
        entity.setBody(body);
        body.getPosition().set(150f, 150f);
    }

    public void render(SpriteBatch spriteBatch) {
        world.step(Gdx.graphics.getDeltaTime(), 6, 2);
        for (Entity entity : entities) {
            Body body = entity.getBody();
            Sprite sprite = entity.getSprite();
            sprite.setPosition(body.getPosition().x, body.getPosition().y);
            //spriteBatch.draw(sprite, sprite.getX(), sprite.getY());
            sprite.draw(spriteBatch);
        }
    }

    public void dispose() {
        for (Entity entity : entities) {
            entity.getTexture().dispose();
        }
    }
}