package com.fixertin.roguelikeGame.GFX;

import com.fixertin.roguelikeGame.entities.Entity;
import com.fixertin.roguelikeGame.main.Game;

public class GameCamera {
	private float xOffset, yOffset;
	private Game game;
	public GameCamera(Game game, float xOffset, float yOffset){
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		this.game = game;
	}
	
	public void centerOnEntity(Entity e){
		xOffset = e.getX() - game.width / 2 + 16;
		yOffset = e.getY() - game.height / 2 + 16;
	}
	
	public void move(float xAmt, float yAmt){
		xOffset += xAmt;
		yOffset += yAmt;
	}

	public float getxOffset() {
		return xOffset;
	}

	public void setxOffset(float xOffset) {
		this.xOffset = xOffset;
	}

	public float getyOffset() {
		return yOffset;
	}

	public void setyOffset(float yOffset) {
		this.yOffset = yOffset;
	}
}
