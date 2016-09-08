package com.fixertin.roguelikeGame.rooms;

import java.awt.Graphics;
import java.util.Random;

public class BasicRoom extends Room{
	public int[][] tiles;

	public BasicRoom(int x, int y) {
		super(x, y);
		w = getRandomInt(8, 13);
		h = getRandomInt(8, 13);
		tiles = new int[w][h];
		load();
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		
	}
	
	public void load(){
		for(int xx=0; xx<w; xx++){
			for(int yy=0; yy<h; yy++){
				if(((xx==0)||(xx==w-1))||((yy==0)||(yy==h-1)))
					tiles[xx][yy] = 1;
				else
					tiles[xx][yy] = 0;		
			}
		}
	}
	
	public int getRandomInt(int min, int max) {
		Random rand = new Random(); 
		return rand.nextInt((max - min) + 1) + min;
	}

}
