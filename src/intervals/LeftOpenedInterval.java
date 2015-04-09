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
		return (minimumIncluded)
				&& (maximumIncluded || maximum == interval.maximum);
	}
	
	public boolean includesUnopenedInterval(UnopenedInterval interval){
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

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		return interval.includesLeftOpenedInterval(this);
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		return interval.includesLeftOpenedInterval(this);
	}

	@Override
	public boolean includes(UnopenedInterval interval) {
		return interval.includesLeftOpenedInterval(this);
	}

	@Override
	public boolean includes(BothOpenedInterval interval) {
		return interval.includesLeftOpenedInterval(this);
	}

	@Override
	protected boolean checkWithBothOpenedInterval(boolean minimumIncluded,
			boolean maximumIncluded) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean checkWithLeftOpenedInterval(boolean minimumIncluded,
			boolean maximumIncluded) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean checkWithRightOpenedInterval(boolean minimumIncluded,
			boolean maximumIncluded) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean checkWithUnopenedInterval(boolean minimumIncluded,
			boolean maximumIncluded) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
