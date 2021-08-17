package com.garcia;

import com.badlogic.gdx.Game;

/*
	This class controls which game screen is being shown
	(pause scree, gameplay screen, game over screen, inventory
	screen, etc.)
 */
public class MyGdxGame extends Game {

	@Override
	public void create() {
		setScreen(new Gameplay_Screen());
	}
}
