
public class animal1 {
	String name;
	int age;
	animal1(String name, int age){
	this.name = name;
    this.age = age;
	}
	String getName(){
	return name;	
	}
	int getAge(){
	return age;	
	}
	void speak(){ 		
	System.out.println("Woff");
	}
public static void main(String[] args) {
animal1 animal2 = new animal1 ("Jack",5);
 animal2. speak();
}
}
