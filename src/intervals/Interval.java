package intervals;

public abstract class Interval {

	protected double minimum;
	protected double maximum;
	protected Opening opening;

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (maximum + minimum) / 2;
	}

	public boolean intersectsWith(Interval interval) {
		if (minimum == interval.maximum) return intersectsWithIntervalMinimum(interval);
		if (maximum == interval.minimum) return intersectsWithIntervalMaximum(interval);
		return intersectsWithIntervalNoBoundaries(interval);
	}
	
	public abstract boolean includes(double value);

	public abstract boolean includes(Interval interval);
	
	public abstract boolean includes(BothOpenedInterval interval);
	
	public abstract boolean includes(LeftOpenedInterval interval);
	
	public abstract boolean includes(RightOpenedInterval interval);
	
	public abstract boolean includes(UnopenedInterval interval);

	public boolean includesBothOpenedInterval(BothOpenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return checkWithBothOpenedInterval(minimumIncluded, maximumIncluded);
	}
	
	protected abstract boolean checkWithBothOpenedInterval(boolean minimumIncluded, boolean maximumIncluded);

	public boolean includesLeftOpenedInterval(LeftOpenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return checkWithLeftOpenedInterval(minimumIncluded, maximumIncluded);
	}
	
	protected abstract boolean checkWithLeftOpenedInterval(boolean minimumIncluded, boolean maximumIncluded);

	public boolean includesRightOpenedInterval(RightOpenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return checkWithRightOpenedInterval(minimumIncluded, maximumIncluded);
	}
	
	protected abstract boolean checkWithRightOpenedInterval(boolean minimumIncluded, boolean maximumIncluded);

	public boolean includesUnopenedInterval(UnopenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return checkWithUnopenedInterval(minimumIncluded, maximumIncluded);
	}
	
	protected abstract boolean checkWithUnopenedInterval(boolean minimumIncluded, boolean maximumIncluded);

	protected abstract boolean intersectsWithIntervalMaximum(Interval interval);

	protected abstract boolean intersectsWithIntervalMinimum(Interval interval);

	protected boolean intersectsWithIntervalNoBoundaries(Interval interval){
		return this.includes(interval.minimum) || this.includes(interval.maximum);
	}
	
	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}

}
