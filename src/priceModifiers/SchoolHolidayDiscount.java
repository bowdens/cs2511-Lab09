package priceModifiers;

import solution.PriceModifier;
import solution.PriceModifierDecorator;

public class SchoolHolidayDiscount extends PriceModifierDecorator implements PriceModifier {

	public SchoolHolidayDiscount(PriceModifier priceModifier) {
		super(priceModifier);
	}

	@Override
	public double getMyModifierPercent() {
		return -0.25;
	}

}
