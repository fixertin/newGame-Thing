package com.fixertin.roguelikeGame.entities;

import java.awt.Graphics;

import com.fixertin.roguelikeGame.main.Game;

public abstract class Entity {
	protected float x, y, velx, vely;
	protected Game game;
	
	public Entity(Game game, float x, float y){
		this.x = x;
		this.y = y;
		this.game = game;
		velx = 0;
		velx = 0;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getVelx() {
		return velx;
	}

	public void setVelx(float velx) {
		this.velx = velx;
	}

	public float getVely() {
		return vely;
	}

	public void setVely(float vely) {
		this.vely = vely;
	}

}
