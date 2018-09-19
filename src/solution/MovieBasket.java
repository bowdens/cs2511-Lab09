package solution;

import java.util.ArrayList;

public class MovieBasket implements MovieComponent {

	private PriceModifier priceModifier;
	private ArrayList<Movie> movies;
	
	public MovieBasket(PriceModifier priceModifier) {
		this.movies = new ArrayList<Movie>();
		setPriceModifier(priceModifier);
	}
	
	@Override
	public double getCharge(int days) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void addMovie(Movie movie) {
		this.movies.add(movie);
	}

	public PriceModifier getPriceModifier() {
		return priceModifier;
	}

	public void setPriceModifier(PriceModifier priceModifier) {
		this.priceModifier = priceModifier;
	}

}
