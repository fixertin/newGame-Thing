package com.fixertin.roguelikeGame.states;

import java.awt.Graphics;

import com.fixertin.roguelikeGame.main.Game;

public abstract class State {
	private static State currentState = null;
	protected Game game;
	
	public State(Game game){
		this.game = game;
	}
	
	public static void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
}
