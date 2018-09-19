package movieTypes;

import solution.MovieType;

public class NewRelease extends MovieType {

	
	/**
	 * @return the baseRate
	 */
	public double getBaseRate() {
		return 5;
	}

	/**
	 * @return the baseDays
	 */
	public int getBaseDays() {
		return 1;
	}

	/**
	 * @return the extraRate
	 */
	public double getExtraRate() {
		return 5;
	}
}
