package com.jakob.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jakob.game.FlappyBird;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = FlappyBird.HEIGHT;
		config.width = FlappyBird.WIDTH;
		config.title = FlappyBird.TITLE;

		new LwjglApplication(new FlappyBird(), config);
	}
}
