package movieTypes;

import solution.MovieType;

public class Regular extends MovieType {

	@Override
	public double getBaseRate() {
		return 3;
	}

	@Override
	public int getBaseDays() {
		return 3;
	}

	@Override
	public double getExtraRate() {
		return 1;
	}

}
