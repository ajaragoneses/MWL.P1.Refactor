package intervals;

public abstract class Interval {

	protected double minimum;
	protected double maximum;
	protected Opening opening;
	
	protected Point MinimumPoint;
	protected Point MaximumPoint;

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (MaximumPoint.getValue() + MinimumPoint.getValue()) / 2;
	}

	public boolean intersectsWith(Interval interval) {
		if (MinimumPoint.getValue() == interval.MaximumPoint.getValue()) return intersectsWithIntervalMinimum(interval);
		if (MaximumPoint.getValue() == interval.MinimumPoint.getValue()) return intersectsWithIntervalMaximum(interval);
		return intersectsWithIntervalNoBoundaries(interval);
	}
	
	public Point getMinimumPoint() {
		return MinimumPoint;
	}

	public void setMinimumPoint(Point minimumPoint) {
		MinimumPoint = minimumPoint;
	}

	public Point getMaximumPoint() {
		return MaximumPoint;
	}

	public void setMaximumPoint(Point maximumPoint) {
		MaximumPoint = maximumPoint;
	}

	public abstract boolean includes(double value);

	public abstract boolean includes(Interval interval);
	
	
	
	public abstract boolean includes(BothOpenedInterval interval);
	
	public abstract boolean includes(LeftOpenedInterval interval);
	
	public abstract boolean includes(RightOpenedInterval interval);
	
	public abstract boolean includes(UnopenedInterval interval);
	
	

	public abstract boolean includesBothOpenedInterval(BothOpenedInterval interval);
	
	public abstract boolean includesLeftOpenedInterval(LeftOpenedInterval interval);
	
	public abstract boolean includesRightOpenedInterval(RightOpenedInterval interval);
	
	public abstract boolean includesUnopenedInterval(UnopenedInterval interval);
	
	
	
	protected abstract boolean intersectsWithIntervalMaximum(Interval interval);

	protected abstract boolean intersectsWithIntervalMinimum(Interval interval);

	protected boolean intersectsWithIntervalNoBoundaries(Interval interval){
		return this.includes(interval.MinimumPoint.getValue()) || this.includes(interval.MaximumPoint.getValue());
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
