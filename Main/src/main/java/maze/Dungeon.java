package maze;
import java.util.ArrayList;

import entities.Enemy;
import entities.Interactive;
import run.ElissaRunner;

public class Dungeon implements Interactive {
	public ArrayList<int[]> area;
	public ArrayList<Enemy> enemies;
	public Chest loot;
	
	public Dungeon(ArrayList<int[]> a, ArrayList<Enemy> e, Chest c) {
		area = a;
		enemies = e;
		loot = c;
	}
	@Override
	public void interact(ElissaRunner r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void disappear(Interactive[][] arr, int a, int b) {
		// TODO Auto-generated method stub
		for(int[] i : area) arr[i[0]][i[1]] = null;
		arr[a][b] = loot;
	}
}