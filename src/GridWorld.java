import java.awt.Color;
import java.util.Random;
import info.gridworld.actor.*;
import info.gridworld.world.*;
import info.gridworld.gui.*;
import info.gridworld.grid.*;

public class GridWorld {

	public static void main(String[] args) {
		int number = new Random().nextInt(10);
		int number1 = new Random().nextInt(10);
		World World1= new World();
		World1.show();
        Bug Bug1 = new Bug();
        Location Location1 = new Location(2, 2);
        World1.add(Location1, Bug1);
        Bug Bug2 = new Bug();
        Location Location2 = new Location(number, number1);
        World1.add(Location2, Bug2);
        Bug1.setColor(Color.DARK_GRAY);
        Bug2.setColor(Color.BLUE);
        Bug1.turn();
        Bug1.turn();
        Bug2.turn();
        Bug2.turn();
        Flower Flower1 = new Flower();
        Flower Flower2 = new Flower();
        Location Location3 = new Location (number, number1 - 1);
        World1.add(Location3, Flower1);
        Location Location4 = new Location(number, number1 + 1);
        World1.add(Location4, Flower2);*/
		Flower Flower1 = new Flower();
		for (int i = 0; i < args.length; i++) {
			
		}
	}

}

8.

Fill the
whole world
with flowers!*9.[Optional]
Color the
flowers in
rows like
the American

flag (red & white)
*/