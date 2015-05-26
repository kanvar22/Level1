import java.awt.Color;

import org.teachingextensions.logo.Tortoise;


public class Houses {
public static void main(String[] args) {
	Tortoise.setSpeed(10);
	Tortoise.setY(400);
	Tortoise.setX(10);
	Tortoise.show();
	building("small",Color.red);
	building("large",Color.red);
	building("medium",Color.red);
	building("small",Color.red);
	building("large",Color.red); 
}
static void building (String Size, Color hi)
{
	int height;
	if (Size .equals("small")) {
		height = 60;	
		 }	
	else if (Size.equals("medium")) {
		height=120;
	}
	else
	{
		height=120;
	}
	
	
	Tortoise.move(height);
	if (Size.equals ("large")) {
		pointyroof();
	}
	else {
		flatroof();
	}
	Tortoise.move(height);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.green);
	Tortoise.move(25);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.black);
	
}
public static void pointyroof() {
	Tortoise.turn(45);
	Tortoise.move(10);
	Tortoise.turn(90);
	Tortoise.move(10);
	Tortoise.turn(45);
}
public static void flatroof() {
	Tortoise.turn(90);
	Tortoise.move(30);
	Tortoise.turn(90);
	
}	

}

