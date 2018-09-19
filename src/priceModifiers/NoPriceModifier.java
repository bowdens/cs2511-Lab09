package priceModifiers;

import solution.PriceModifier;

public class NoPriceModifier implements PriceModifier {

	@Override
	public double getModifierPercent() {
		return 0;
	}

}
