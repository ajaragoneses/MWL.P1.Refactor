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
}
