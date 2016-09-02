package com.fixertin.roguelikeGame.worlds;

import java.awt.Graphics;

import com.fixertin.roguelikeGame.entities.creatures.Player;
import com.fixertin.roguelikeGame.main.Game;
import com.fixertin.roguelikeGame.tiles.Tile;

public class World {
	private int width, height;
	private int[][] tiles;
	private Game game;
	
	public World(Game game){
		this.game = game;
		loadWorld();
	}
	
	
	private void loadWorld(){
		width = 31;
		height = 31;
		tiles = new int[width][height];
		for(int yy=0; yy<height; yy++){
			for(int xx=0; xx<width; xx++){
				if(((xx ==0)||(xx==30))||((yy==0)||(yy==30)))
					tiles[xx][yy] = 1;
				else
					tiles[xx][yy] = 0;
			}
		}
		
	}
	
	public Tile getTile(int x, int y){
		Tile t = Tile.tiles[tiles[x][y]];
		if(t==null)
			return Tile.stoneTile;
		return t;
	}
	
	public void tick(){
	
	}
	public void render(Graphics g){
		int xStart = (int) Math.max(0, game.getCamera().getxOffset() / 32);
		int xEnd = (int) Math.min(width, (game.getCamera().getxOffset() + game.width) / 32 + 1);
		int yStart = (int) Math.max(0, game.getCamera().getyOffset() / 32);
		int yEnd = (int) Math.min(height, (game.getCamera().getyOffset() + game.height)/32 + 1);
		
		for(int yy=yStart; yy<yEnd; yy++){
			for(int xx=xStart; xx<xEnd; xx++){
				getTile(xx, yy).render(g, (int)(xx*32 - game.getCamera().getxOffset()), (int)(yy*32 - game.getCamera().getyOffset()));
			}
		}
	}
}
