package com.blitz.game;

import com.badlogic.gdx.Game;
import com.blitz.game.screens.MainMenu;

public class Blitz extends Game {
	
	public static final String TITLE = "Game Project";
	public static final int WIDTH=480, HEIGHT=800;
	
	@Override
	public void create(){
		setScreen(new MainMenu());
	}
	
}
