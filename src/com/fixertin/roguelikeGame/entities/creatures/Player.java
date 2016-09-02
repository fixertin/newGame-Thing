package com.fixertin.roguelikeGame.entities.creatures;

import java.awt.Graphics;

import com.fixertin.roguelikeGame.GFX.Assets;
import com.fixertin.roguelikeGame.main.Game;

public class Player extends Creature{
	
	public Player(Game game, float x, float y) {
		super(game, x, y);
	}
	
	public void getInput(){
		velx = 0;
		vely = 0;
		if(game.getKeyManager().up)
			vely = -speed;
		if(game.getKeyManager().down)
			vely = speed;
		if(game.getKeyManager().left)
			velx = -speed;
		if(game.getKeyManager().right)
			velx = speed;
	}
	
	@Override
	public void tick() {
		getInput();
		move();
		game.getCamera().centerOnEntity(this);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, (int)(x - game.getCamera().getxOffset()), (int)(y - game.getCamera().getyOffset()), null);
	}

}
