import java.awt.Color;


public class SmurfRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Smurf HandySmurf = new Smurf("HandySmurf");
HandySmurf.eat();
System.out.println(HandySmurf.getName());
Smurf Papa = new Smurf("Papa");
System.out.println(Papa.getName());
System.out.println(Papa.getHatColor());
System.out.println(Papa.isGirlOrBoy());
Smurf Smurfette = new Smurf("Smurfette");
System.out.println(Smurfette.getName());
System.out.println(Smurfette.getHatColor());
System.out.println(Smurfette.isGirlOrBoy());
	}
	
	

}
  