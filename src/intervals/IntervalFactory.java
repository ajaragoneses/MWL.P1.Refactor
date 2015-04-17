package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		if(opening == Opening.BOTH_OPENED) return new BothOpenedInterval(minimum, maximum);
		if(opening == Opening.LEFT_OPENED) return new LeftOpenedInterval(minimum, maximum);
		if(opening == Opening.RIGHT_OPENED) return new RightOpenedInterval(minimum, maximum);
		if(opening == Opening.UNOPENED) return new UnopenedInterval(minimum, maximum);
		return new NullInterval(maximum, maximum);
	}
}
