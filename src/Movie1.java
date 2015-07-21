
class Movie1 implements Comparable<Movie> {

	private String title;
	private int stars;

	public Movie1(String title, int stars) {
		this.title = title;
		this.stars = stars;
	}

	public String getTitle() {
		return this.title;
	}

	public int getRating() {
		return this.stars;
	}

	public String toString() {
		return "\"" + title + "\" - " + stars + " stars";
	}

public String getTicketPrice() {
		if (this.stars > 2) {
			return "That will be $12 please.";
		} else if (this.title.contains("Twilight")) {
			return "This movie is so bad, we'll pay YOU to watch it!";
		} else {
			return "Don't waste your money on this horrible rubbish.";
		}
	}


	public int compareTo(Movie otherMovie) {
		int compareQuantity = otherMovie.getRating();

		// return this.stars - compareQuantity; //ascending order
		return compareQuantity - this.stars; // descending order
	}
public static void main(String[] args) {
	Movie percyJackson = new Movie("Percy Jackson", 4);
	Movie gaurdiansOfTheGalexy = new Movie("Star Lord", 5);
	Movie mazeRunner = new Movie("Thomas", 5);
	Movie jurassicWorld = new Movie("Owen", 5);
	Movie starWars = new Movie("Anikan", 4);
	System.out.println(percyJackson.getTicketPrice());
	System.out.println(gaurdiansOfTheGalexy.getTicketPrice());
	System.out.println(mazeRunner.getTicketPrice());
	System.out.println(jurassicWorld.getTicketPrice());
	System.out.println(starWars.getTicketPrice());
	
}
}
