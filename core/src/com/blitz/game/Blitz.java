package com.blitz.game;

import com.badlogic.gdx.Game;
import com.blitz.game.screens.MainMenu;
import com.blitz.game.screens.testmap;

public class Blitz extends Game {
	
	public static final String TITLE = "Game Project";
	public static final int WIDTH=480, HEIGHT=800;
	public testmap map;
	
	@Override
	public void create(){
		map = new testmap();
		setScreen(new MainMenu(this));
		
	}
	
}
