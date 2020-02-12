package com.daniel.opium.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;

public class Entity {
    private float x = 0;
    private float y = 0;
    private Texture texture;
    public BodyDef bodyDef = new BodyDef();
    private Sprite sprite;
    protected BodyDef.BodyType bodyType;
    protected Body body;

    public Entity(BodyDef.BodyType bodyType) {
        this.setBodyType(bodyType);
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public BodyDef.BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyDef.BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        //this.sprite.setX(x);
        this.bodyDef.position.x = x;
    }

    public float getY() { return y; }

    public void setY(float y) {
        this.bodyDef.position.y = y;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
        this.setSprite(new Sprite(this.texture));
    }

    public BodyDef getBodyDef() {
        bodyDef.type = this.getBodyType();
        bodyDef.position.set(sprite.getX(), sprite.getY());
        return this.bodyDef;
    }

    public FixtureDef getFixtureDef() {
        // Now define the dimensions of the physics shape
        PolygonShape shape = new PolygonShape();
        // We are a box, so this makes sense, no?
        // Basically set the physics polygon to a box with the same dimensions
        //as our sprite
        shape.setAsBox(sprite.getWidth()/2, sprite.getHeight()/2);

        // FixtureDef is a confusing expression for physical properties
        // Basically this is where you, in addition to defining the shape of the
        //body
        // you also define it's properties like density, restitution and others
        //we will see shortly
        // If you are wondering, density and area are used to calculate over all
        //mass
        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = 1f;
        fixtureDef.density = 0;
        return fixtureDef;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
