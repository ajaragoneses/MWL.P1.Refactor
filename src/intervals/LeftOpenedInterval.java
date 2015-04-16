package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		MinimumPoint = new OpenPoint(minimum);
		MaximumPoint = new ClosePoint(maximum);
	}

	@Override
	public boolean includes(double value){
		return minimum < value && value <= maximum;
	}
	
	@Override
	public boolean includes(Interval interval) {
		return MinimumPoint.isLessOrEqualThan(interval.getMinimumPoint()) 
				&& MaximumPoint.isGreatherOrEqualThan(interval.getMaximumPoint());
	}
	
	
	
	@Override
	protected boolean intersectsWithIntervalMinimum(Interval interval) {
		return false;
	}

	@Override
	protected boolean intersectsWithIntervalMaximum(Interval interval) {
		return interval.opening == Opening.RIGHT_OPENED ||
				interval.opening == Opening.UNOPENED;
	}
	
}
