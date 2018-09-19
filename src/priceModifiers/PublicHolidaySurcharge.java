package priceModifiers;

import solution.PriceModifier;
import solution.PriceModifierDecorator;

public class PublicHolidaySurcharge extends PriceModifierDecorator implements PriceModifier {

	public PublicHolidaySurcharge(PriceModifier priceModifier) {
		super(priceModifier);
	}

	@Override
	public double getMyModifierPercent() {
		return 0.1;
	}

}
