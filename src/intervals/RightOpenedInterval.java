package intervals;

public class RightOpenedInterval extends Interval {

	public RightOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		MinimumPoint = new ClosePoint(minimum);
		MaximumPoint = new OpenPoint(maximum);
	}

	@Override
	public boolean includes(double value){
		return MinimumPoint.getValue() <= value && value < MaximumPoint.getValue();
	}
	
	@Override
	public boolean includes(Interval interval) {
		return MinimumPoint.isLessOrEqualThan(interval.getMinimumPoint()) 
				&& MaximumPoint.isGreatherOrEqualThan(interval.getMaximumPoint());
	}

	public boolean includesBothOpenedInterval(BothOpenedInterval interval){
		return MinimumPoint.isLessOrEqualThan(interval.getMinimumPoint()) 
				&& MaximumPoint.isGreatherOrEqualThan(interval.getMaximumPoint());
	}
	
	public boolean includesLeftOpenedInterval(LeftOpenedInterval interval){
		return MinimumPoint.isLessOrEqualThan(interval.getMinimumPoint())
				&& MaximumPoint.isGreatherOrEqualThan(interval.getMaximumPoint());
	}
	
	public boolean includesRightOpenedInterval(RightOpenedInterval interval){
		return MinimumPoint.isLessOrEqualThan(interval.getMinimumPoint())
				&& MaximumPoint.isGreatherOrEqualThan(interval.getMaximumPoint());
	}
	
	public boolean includesUnopenedInterval(UnopenedInterval interval){
		return MinimumPoint.isLessOrEqualThan(interval.getMinimumPoint())
				&& MaximumPoint.isGreatherOrEqualThan(interval.getMaximumPoint());
	}
	
	@Override
	protected boolean intersectsWithIntervalMaximum(Interval interval) {
		return false;
	}

	@Override
	protected boolean intersectsWithIntervalMinimum(Interval interval) {
		return interval.opening == Opening.LEFT_OPENED ||
				interval.opening == Opening.UNOPENED;
	}

	@Override
	public boolean includes(BothOpenedInterval interval) {
		return interval.includesRightOpenedInterval(this);
	}

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		return interval.includesRightOpenedInterval(this);
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		return interval.includesRightOpenedInterval(this);
	}

	@Override
	public boolean includes(UnopenedInterval interval) {
		return interval.includesRightOpenedInterval(this);
	}
	
}
