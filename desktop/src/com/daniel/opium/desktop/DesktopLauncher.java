package com.daniel.opium.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.daniel.opium.Opium;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "opium";
		config.height = 650;
		config.width = 1150;
		new LwjglApplication(new Opium(), config);
	}
}
