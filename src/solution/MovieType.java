package solution;

public abstract class MovieType {
	
	public abstract double getBaseRate();
	public abstract int getBaseDays();
	public abstract double getExtraRate();
	
	public double getCharge(int days) {
		if (days > getBaseDays()) {
			int extraDays = days - getBaseDays();
			return getBaseRate() + extraDays * getExtraRate();
		} else {
			return getBaseRate();
		}
	}
}
