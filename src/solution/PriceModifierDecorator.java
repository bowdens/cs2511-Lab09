package solution;

public abstract class PriceModifierDecorator implements PriceModifier {
	
	private PriceModifier priceModifier;
	public PriceModifierDecorator(PriceModifier priceModifier) {
		this.priceModifier = priceModifier;
	}
	
	public abstract double getMyModifierPercent();
	
	@Override
	public double getModifierPercent() {
		return priceModifier.getModifierPercent() + getMyModifierPercent();
	}

}
