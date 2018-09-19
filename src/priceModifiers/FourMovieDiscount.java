package priceModifiers;

import solution.PriceModifier;
import solution.PriceModifierDecorator;

public class FourMovieDiscount extends PriceModifierDecorator implements PriceModifier {

	public FourMovieDiscount(PriceModifier priceModifier) {
		super(priceModifier);
	}

	@Override
	public double getMyModifierPercent() {
		return -0.10;
	}

}
