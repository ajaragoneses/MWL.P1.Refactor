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
}
