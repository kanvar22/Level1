

public class Main {
public static void main(String[] args) {
	//1. Instantiate some Movie objects (at least 5).

Movie JamesBond = new Movie("JamesBond", 5);	
Movie MissionImossibale = new Movie("MissionImpossibale", 5);
Movie Echo = new Movie("Echo", 5);
Movie WhenTheGameStandsTall = new Movie("WhenTheGameStandsTall", 5);
Movie AmericanSniper = new Movie("AmericanSniper", 5);

	//2. Use the methods in the Movie object to print the name and rating of your favorite.
    
System.out.println("My favorite movie is " + WhenTheGameStandsTall.getTitle() +" with a rating of" + 
WhenTheGameStandsTall.getRating());

	//3. Instantiate a NetflixQueue.
    NetflixQueue List = new NetflixQueue ();
	//4. Add your movies to the Netflix queue.
    List.addMovie(WhenTheGameStandsTall);
    List.addMovie(JamesBond);
    List.addMovie(Echo);
    List.addMovie(MissionImossibale);
    List.addMovie(AmericanSniper);
	//5. Print all the movies in your queue.
		
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 


}
}
