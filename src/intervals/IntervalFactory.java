package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		if(opening == Opening.BOTH_OPENED) return new BothOpenedInterval(minimum, maximum, opening);
		return new Interval(minimum, maximum, opening);
	}
}
