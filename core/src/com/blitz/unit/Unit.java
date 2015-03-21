package com.blitz.unit;

abstract class Unit {	
	protected int maxMove; //grid spaces not including terrain penalties
	protected int ammo;
	protected int fuel;
	protected int health;

	//some way to list terrain that can be crossed
	//tentative string
	protected String [] allowedTerrain;
	
	//implement terrain penalties somehow, maybe in terrain classes
	
	protected boolean hasMoved;
}
