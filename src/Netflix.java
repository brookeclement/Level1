
public class Netflix {
	
	public static void main(String[]args)
	{
		Movie mov1 = new Movie("The Girl on the Train", 4);
		Movie mov2 = new Movie("Suicide Squad", 3);
		Movie mov3 = new Movie("The Godfather", 5);
		Movie mov4 = new Movie("Joy", 2);
		Movie mov5 = new Movie("Bloodrayne", 1);
		
		mov1.getTicketPrice();
		
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(mov1);
		netflix.addMovie(mov2);
		netflix.addMovie(mov3);
		netflix.addMovie(mov4);
		netflix.addMovie(mov5);
		
		netflix.sortMoviesByRating();
		netflix.printMovies();
		
		System.out.println("The best movie is " + netflix.getBestMovie());
		System.out.println("The second best movie is " + netflix.getMovie(1));
		
	}

}
