package com.daniel.opium.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.BodyDef;

public class Platform extends Entity {
   public Platform() {
       super(BodyDef.BodyType.StaticBody);
       setTexture(new Texture("platforms/platform.png"));
   }
}
