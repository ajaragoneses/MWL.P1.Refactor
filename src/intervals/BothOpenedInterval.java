package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		MinimumPoint = new OpenPoint(minimum);
		MaximumPoint = new OpenPoint(maximum);
	}
	
	@Override
	public boolean includes(double value) {
		return  MinimumPoint.getValue() < value && value < MaximumPoint.getValue();
	}

	@Override
	public boolean includes(Interval interval){
//		return interval.includes(this);
		return MinimumPoint.isLessThan(interval.getMinimumPoint()) && MaximumPoint.isGreatherThan(interval.getMaximumPoint());
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
				&& (maximumIncluded);
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
		return (minimumIncluded) && (maximumIncluded);
	}

	@Override
	protected boolean intersectsWithIntervalMaximum(Interval interval) {
		return false;
	}

	@Override
	protected boolean intersectsWithIntervalMinimum(Interval interval) {
		return false;
	}

	@Override
	public boolean includes(BothOpenedInterval interval) {
		return interval.includesBothOpenedInterval(this);
	}

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		return interval.includesBothOpenedInterval(this);
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		return interval.includesBothOpenedInterval(this);	}

	@Override
	public boolean includes(UnopenedInterval interval) {
		return interval.includesBothOpenedInterval(this);
	}
	
}
