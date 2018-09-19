package solution;

public class Movie implements MovieComponent {
	
	private String name;
	private MovieType type;
	private PriceModifier priceModifier;

	public Movie(String name, MovieType movieType, PriceModifier priceModifier) {
		setName(name);
		setType(movieType);
		setPriceModifier(priceModifier);
	}
	
	@Override
	public double getCharge(int days) {
		return this.type.getCharge(days) * (1 + this.priceModifier.getModifierPercent());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MovieType getType() {
		return type;
	}

	public void setType(MovieType type) {
		this.type = type;
	}

	public PriceModifier getPriceModifier() {
		return priceModifier;
	}

	public void setPriceModifier(PriceModifier priceModifier) {
		this.priceModifier = priceModifier;
	}

}
