package com.daniel.opium.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.BodyDef;

public class Player extends Entity {
    public Player() {
        super(BodyDef.BodyType.DynamicBody);
        setTexture(new Texture("characters/Adventurer-1.5/Individual-Sprites/adventurer-idle-00.png"));
    }
}
