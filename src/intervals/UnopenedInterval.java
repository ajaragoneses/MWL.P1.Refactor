package intervals;

public class UnopenedInterval extends Interval {

	public UnopenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		MinimumPoint = new ClosePoint(minimum);
		MaximumPoint = new ClosePoint(maximum);
	}

	@Override
	public boolean includes(double value){
		return minimum <= value && value <= maximum;
	}
	
	@Override
	public boolean includes(Interval interval) {
		return MinimumPoint.isLessOrEqualThan(interval.getMinimumPoint()) 
				&& MaximumPoint.isGreatherOrEqualThan(interval.getMaximumPoint());
	}

	public boolean includesBothOpenedInterval(BothOpenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return (minimumIncluded || minimum == interval.minimum)
				&& (maximumIncluded || maximum == interval.maximum);
	}
	
	public boolean includesLeftOpenedInterval(LeftOpenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return (minimumIncluded || minimum == interval.minimum)
				&& (maximumIncluded || maximum == interval.maximum);
	}
	
	public boolean includesRightOpenedInterval(RightOpenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return (minimumIncluded || minimum == interval.minimum)
				&& (maximumIncluded || maximum == interval.maximum);
	}
	
	public boolean includesUnopenedInterval(UnopenedInterval interval){
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.maximum);
		return (minimumIncluded || minimum == interval.minimum)
				&& (maximumIncluded || maximum == interval.maximum);
	}
	
	@Override
	protected boolean intersectsWithIntervalMaximum(Interval interval) {
		return interval.opening == Opening.RIGHT_OPENED ||
				interval.opening == Opening.UNOPENED;
	}

	@Override
	protected boolean intersectsWithIntervalMinimum(Interval interval) {
		return interval.opening == Opening.LEFT_OPENED ||
				interval.opening == Opening.UNOPENED;
	}

	@Override
	public boolean includes(BothOpenedInterval interval) {
		return interval.includesUnopenedInterval(this);
	}

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		return interval.includesUnopenedInterval(this);
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		return interval.includesUnopenedInterval(this);
	}

	@Override
	public boolean includes(UnopenedInterval interval) {
		return interval.includesUnopenedInterval(this);
	}

}
