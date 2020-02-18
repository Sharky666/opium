package com.daniel.opium;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.daniel.opium.entities.Entity;
import com.daniel.opium.entities.Player;
import com.daniel.opium.screens.GameScreen;
import com.daniel.opium.screens.Screen;
import com.daniel.opium.singletons.KeyboardEventListener;

import java.util.ArrayList;

public class Opium extends ApplicationAdapter {
	SpriteBatch batch;
	KeyboardEventListener keyboardEventListener = KeyboardEventListener.getInstance();
	Screen currentScreen;

	@Override
	public void create () {
		//TODO: learn what a spriteBatch is
		batch = new SpriteBatch();
		currentScreen = new GameScreen();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		this.currentScreen.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		this.currentScreen.dispose();
	}
}
