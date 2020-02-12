package com.daniel.opium.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.BodyDef;

public class Rock extends Entity {
    public Rock() {
        super(BodyDef.BodyType.DynamicBody);
        this.setY(50);
        setTexture(new Texture("badlogic.jpg"));
    }
}
