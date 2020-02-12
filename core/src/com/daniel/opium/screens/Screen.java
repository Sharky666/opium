package com.daniel.opium.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Screen {
    public abstract void render(SpriteBatch spriteBatch);
    public abstract void dispose();
}
