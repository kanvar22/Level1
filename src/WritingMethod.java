
public class WritingMethod {
	public static void main(String[] args) {
        WritingMethod method = new WritingMethod();
		method.iRock();
		method.rocker("me");
		method.truth("Justin Biber");
		method.echo("hi");
		method.repeat(9, "pizza");
		String me = method.bestProgrammer();
		System.out.println();
	}
	public void iRock(){
		System.out.println("Kanvar rocks");
	}
	public void rocker(String name){
		System.out.println(name +" rocks");
	}
	public void truth(String name){
		if ("Justin Biber".equals (name)) {
			System.out.println(name+" sucks");
		}
		else {
			System.out.println(name+" awesome");
		} 
	}
	public void echo(String name) {
		System.out.println(name+" "+name);
	}
	public void repeat(int number, String name){
		for (int i = 0; i < number; i++) {
			System.out.println(""+name);
		}
		
	}
	public String bestProgrammer(){
		return("me");
	}
}
