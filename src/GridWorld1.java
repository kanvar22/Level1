import java.util.Random;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class GridWorld1 {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		world.show();
		Bug bug = new Bug();
		Location loc = new Location(5, 5);
		world.add(loc, bug);
		int randomx = new Random().nextInt(10);
		int randomy = new Random().nextInt(10);
		Location loc2 = new Location(randomx, randomy);
		world.add(loc2, bug);
	}
}
