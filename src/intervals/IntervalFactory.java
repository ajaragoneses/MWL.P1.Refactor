package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		if(opening == Opening.BOTH_OPENED) return new BothOpenedInterval(minimum, maximum, opening);
		if(opening == Opening.LEFT_OPENED) return new LeftOpenedInterval(minimum, maximum, opening);
		if(opening == Opening.RIGHT_OPENED) return new RightOpenedInterval(minimum, maximum, opening);
		return new Interval(minimum, maximum, opening);
	}
}
