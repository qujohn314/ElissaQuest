package run;

import java.util.ArrayList;

import entities.Enemy;
import entities.Player;
import gui.MainFightPanel;
import maze.Maze;



 
public class GamePlay implements Runnable{
	public int scale = 2;
	  public static boolean openPanel = true;
	public Maze maze;
	public DrawScreen r;
	public String returnText = " ";
	public Player player = new Player(this);
	public GamePlay(DrawScreen r) {
		this.r = r;
	}
	
	public void newFight(Enemy e) {
		r.setVisible(false);
		r.window.add(new MainFightPanel(e));
	}
	
	public void newFight(ArrayList<Enemy> e) {
		r.setVisible(false);
		r.window.add(new MainFightPanel(e));
	}
	
	public void go() {
		System.out.println("go");
		maze = new Maze(30, 15);
		maze.interact(this);
		maze = new Maze(40, 20);
		maze.interact(this);
		maze = new Maze(50, 25);
		maze.interact(this);
		maze = new Maze(60, 30);
		maze.interact(this);
		maze = new Maze(70, 35);
		maze.interact(this);
		maze = new Maze(80, 40);
		maze.interact(this);
	}

	
	public void userWait() {
		synchronized(r.returnText) {
			while(r.returnText.isEmpty()) {
	        	try {
	        		r.returnText.wait();
	        	} catch (InterruptedException e) {}
	    	}
			returnText = r.returnText.remove(0);
		}
	}

	@Override
	public void run() {
		go();
		
	}
}
