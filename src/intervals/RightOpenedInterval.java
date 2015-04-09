package intervals;

public class RightOpenedInterval extends Interval {

	public RightOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value){
		return minimum <= value && value < maximum;
	}
	
	@Override
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		switch (interval.opening) {
		case BOTH_OPENED:
			return (minimumIncluded || minimum == interval.minimum)
					&& (maximumIncluded || maximum == interval.maximum);
		case LEFT_OPENED:
			return (minimumIncluded || minimum == interval.minimum)
					&& (maximumIncluded);
		case RIGHT_OPENED:
			return (minimumIncluded || minimum == interval.minimum)
					&& (maximumIncluded || maximum == interval.maximum);
		case UNOPENED:
			return (minimumIncluded || minimum == interval.minimum)
					&& (maximumIncluded);
		default:
			assert false;
			return false;
		}
	}
	
	@Override
	public boolean intersectsWith(Interval interval) {
		if (minimum == interval.maximum) {
			return interval.opening == Opening.LEFT_OPENED ||
					interval.opening == Opening.UNOPENED;
		}
		if (maximum == interval.minimum) {
			return false;
		}
		return intersectsWithIntervalNoBoundaries(interval);
	}

	@Override
	protected boolean intersectsWithIntervalMaximum(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean intersectsWithIntervalMinimum(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
