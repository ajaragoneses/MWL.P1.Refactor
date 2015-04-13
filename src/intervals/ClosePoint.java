package intervals;

public class ClosePoint extends Point{

	@Override
	public boolean isLessThan(Point point) {
		return false;
	}

	@Override
	public boolean isGreatherThan(Point point) {
		return false;
	}

}
