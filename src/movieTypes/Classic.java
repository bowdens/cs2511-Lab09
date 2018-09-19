package movieTypes;

import solution.MovieType;

public class Classic extends MovieType {

	@Override
	public double getBaseRate() {
		return 2.5;
	}

	@Override
	public int getBaseDays() {
		return 5;
	}

	@Override
	public double getExtraRate() {
		return 0.5;
	}

}
