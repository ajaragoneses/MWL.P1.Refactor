package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value){
		return minimum < value && value <= maximum;
	}
	
	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
//		boolean minimumIncluded = this.includes(interval.minimum);
//		boolean maximumIncluded = this.includes(interval.maximum);
//		switch (interval.opening) {
//		case BOTH_OPENED:
//			return (minimumIncluded || minimum == interval.minimum)
//					&& (maximumIncluded || maximum == interval.maximum);
//		case LEFT_OPENED:
//			return (minimumIncluded || minimum == interval.minimum)
//					&& (maximumIncluded || maximum == interval.maximum);
//		case RIGHT_OPENED:
//			return (minimumIncluded)
//					&& (maximumIncluded || maximum == interval.maximum);
//		case UNOPENED:
//			return (minimumIncluded)
//					&& (maximumIncluded || maximum == interval.maximum);
//		default:
//			assert false;
//			return false;
//		}
	}
	
	public boolean includes(BothOpenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return (minimumIncluded || minimum == interval.minimum)
				&& (maximumIncluded || maximum == interval.maximum);
	}
	
	public boolean includes(LeftOpenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return (minimumIncluded || minimum == interval.minimum)
				&& (maximumIncluded || maximum == interval.maximum);
	}
	
	public boolean includes(RightOpenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return (minimumIncluded)
				&& (maximumIncluded || maximum == interval.maximum);
	}
	
	public boolean includes(UnopenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return (minimumIncluded)
				&& (maximumIncluded || maximum == interval.maximum);
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
