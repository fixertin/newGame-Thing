package com.fixertin.roguelikeGame.states;

import java.awt.Graphics;

import com.fixertin.roguelikeGame.entities.creatures.Player;
import com.fixertin.roguelikeGame.main.Game;
import com.fixertin.roguelikeGame.worlds.World;

public class GameState extends State{
	public Player player;
	public World world;
	
	public GameState(Game game){
		super(game);
		world = new World(game);
		player = new Player(game, 400, 250);
		game.getCamera().move(player.getX(), player.getY());
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}