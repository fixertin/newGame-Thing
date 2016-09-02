package com.fixertin.roguelikeGame.entities.creatures;

import com.fixertin.roguelikeGame.entities.Entity;
import com.fixertin.roguelikeGame.main.Game;

public abstract class Creature extends Entity{
	
	protected int health;
	protected float speed;

	public Creature(Game game, float x, float y) {
		super(game, x, y);
		health = 100;
		speed = 7;
	}
	
	public void move(){
		x += velx;
		y += vely;
	}

}
