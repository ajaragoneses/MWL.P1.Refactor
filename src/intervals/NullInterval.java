package intervals;

public class NullInterval extends Interval {

	public NullInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value) {
		return false;
	}

	@Override
	public boolean intersectsWith(Interval interval){
		return false;
	}
	
	@Override
	public boolean includes(Interval interval){
		return false;
	}

	@Override
	protected boolean intersectsWithIntervalMaximum(Interval interval) {
		return false;
	}

	@Override
	protected boolean intersectsWithIntervalMinimum(Interval interval) {
		return false;
	}
	
}
