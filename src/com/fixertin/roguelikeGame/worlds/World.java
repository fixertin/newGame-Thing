package com.fixertin.roguelikeGame.worlds;

import java.awt.Graphics;

import com.fixertin.roguelikeGame.entities.creatures.Player;
import com.fixertin.roguelikeGame.main.Game;
import com.fixertin.roguelikeGame.main.Handler;
import com.fixertin.roguelikeGame.rooms.BasicRoom;
import com.fixertin.roguelikeGame.tiles.Tile;

public class World {
	private int width, height;
	private int[][] tiles;
	private Handler handler;
	private BasicRoom basicRoom;
	
	public World(Handler handler){
		this.handler = handler;
		basicRoom = new BasicRoom(0, 0);
		loadWorld(basicRoom.getW(), basicRoom.getH());
	}
	
	
	private void loadWorld(int w, int h){
		width = basicRoom.getW();
		height = basicRoom.getH();
		tiles = basicRoom.tiles;
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
		int xStart = (int) Math.max(0, handler.getCamera().getxOffset() / 32);
		int xEnd = (int) Math.min(width, (handler.getCamera().getxOffset() + handler.getWidth()) / 32 + 1);
		int yStart = (int) Math.max(0, handler.getCamera().getyOffset() / 32);
		int yEnd = (int) Math.min(height, (handler.getCamera().getyOffset() + handler.getHeight())/32 + 1);
		
		for(int yy=yStart; yy<yEnd; yy++){
			for(int xx=xStart; xx<xEnd; xx++){
				getTile(xx, yy).render(g, (int)(xx*32 - handler.getCamera().getxOffset()), (int)(yy*32 - handler.getCamera().getyOffset()));
			}
		}
	}
}
