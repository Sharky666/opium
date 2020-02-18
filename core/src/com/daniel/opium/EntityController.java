package com.daniel.opium;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.daniel.opium.entities.Entity;

public class EntityController {
    Entity currentEntity;
    final float FORCE = 50f;

    public void update() {
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            this.currentEntity.getBody().applyForce(new Vector2(0, this.FORCE * 4), new Vector2(100f, 0f), true);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            this.currentEntity.getBody().applyForce(new Vector2(this.FORCE, 0f), new Vector2(100f, 0f), true);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            this.currentEntity.getBody().applyForce(new Vector2(-this.FORCE, 0), new Vector2(-100f, 0f), true);
        }
    }

    public Entity getCurrentEntity() {
        return currentEntity;
    }

    public void setCurrentEntity(Entity currentEntity) {
        this.currentEntity = currentEntity;
    }
}

