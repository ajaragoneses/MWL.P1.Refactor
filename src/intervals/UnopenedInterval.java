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
	protected boolean intersectsWithIntervalMaximum(Interval interval) {
		return interval.opening == Opening.RIGHT_OPENED ||
				interval.opening == Opening.UNOPENED;
	}

	@Override
	protected boolean intersectsWithIntervalMinimum(Interval interval) {
		return interval.opening == Opening.LEFT_OPENED ||
				interval.opening == Opening.UNOPENED;
	}
}
