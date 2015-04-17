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
}
