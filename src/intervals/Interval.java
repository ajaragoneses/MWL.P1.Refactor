package intervals;

public abstract class Interval {

	protected double minimum;
	protected double maximum;
	
	protected Point MinimumPoint;
	protected Point MaximumPoint;

	public Interval(double minimum, double maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public double midPoint() {
		return (MaximumPoint.getValue() + MinimumPoint.getValue()) / 2;
	}

	public boolean intersectsWith(Interval interval) {
		if (MinimumPoint.getValue() == interval.MaximumPoint.getValue()) return MinimumPoint.intersects(interval.getMaximumPoint());
		if (MaximumPoint.getValue() == interval.MinimumPoint.getValue()) return MaximumPoint.intersects(interval.getMinimumPoint());
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

	public boolean includes(Interval interval){
		return MinimumPoint.isLessOrEqualThan(interval.getMinimumPoint()) 
				&& MaximumPoint.isGreatherOrEqualThan(interval.getMaximumPoint());
	}

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
