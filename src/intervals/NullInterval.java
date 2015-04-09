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

	@Override
	public boolean includes(BothOpenedInterval interval) {
		return false;
	}

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		return false;
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		return false;
	}

	@Override
	public boolean includes(UnopenedInterval interval) {
		return false;
	}

	@Override
	public boolean includesBothOpenedInterval(BothOpenedInterval interval) {
		return false;
	}

	@Override
	public boolean includesLeftOpenedInterval(LeftOpenedInterval interval) {
		return false;
	}

	@Override
	public boolean includesRightOpenedInterval(RightOpenedInterval interval) {
		return false;
	}

	@Override
	public boolean includesUnopenedInterval(UnopenedInterval interval) {
		return false;
	}

	@Override
	protected boolean checkWithBothOpenedInterval(boolean minimumIncluded,
			boolean maximumIncluded) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean checkWithLeftOpenedInterval(boolean minimumIncluded,
			boolean maximumIncluded) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean checkWithRightOpenedInterval(boolean minimumIncluded,
			boolean maximumIncluded) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean checkWithUnopenedInterval(boolean minimumIncluded,
			boolean maximumIncluded) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
