package com.daniel.opium.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.daniel.opium.EntityController;
import com.daniel.opium.entities.Entity;
import com.daniel.opium.entities.Platform;
import com.daniel.opium.entities.Player;

import java.util.ArrayList;

public class GameScreen extends Screen {
    World world = new World(new Vector2(0, -50f), true);
    ArrayList<Entity> entities = new ArrayList<Entity>();
    EntityController entityController = new EntityController();

    public GameScreen() {
        Entity platform = new Platform();
        Entity player = new Player();
        player.setY(200);
        player.setX(200);
        platform.setX(220);
        this.addEntity(player);
        this.addEntity(platform);
        entityController.setCurrentEntity(player);
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
        Body body = this.world.createBody(entity.getBodyDef());
        body.createFixture(entity.getFixtureDef());
        entity.setBody(body);
    }

    public void render(SpriteBatch spriteBatch) {
        this.entityController.update();
        world.step(Gdx.graphics.getDeltaTime(), 6, 2);
        for (Entity entity : entities) {
            Body body = entity.getBody();
            Sprite sprite = entity.getSprite();
            sprite.setPosition(body.getPosition().x, body.getPosition().y);
            sprite.draw(spriteBatch);
        }
    }

    public void dispose() {
        for (Entity entity : entities) {
            entity.getTexture().dispose();
        }
    }
}