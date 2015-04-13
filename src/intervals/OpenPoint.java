package intervals;

public class OpenPoint extends Point{
	
	private boolean isLessOrEqualGeneric(Point point){
		if(value == point.value) return false;
		return value < point.getValue();
	}
	
	private boolean isGreatherOrEqualGeneric(Point point){
		if(value == point.value) return false;
		return value < point.getValue();
	}
	
	@Override
	public boolean isLessOrEqualThan(Point point) {
		return point.isGreatherOrEqualThan(this);
	}
	
	public boolean isLessOrEqualThan(OpenPoint point) {
		return isLessOrEqualGeneric(point);
	}
	
	public boolean isLessOrEqualThan(ClosePoint point) {
		return isLessOrEqualGeneric(point);
	}

	@Override
	public boolean isGreatherOrEqualThan(Point point) {
		return point.isLessOrEqualThan(this);
	}
	
	public boolean isGreatherOrEqualThan(OpenPoint point) {
		return isGreatherOrEqualGeneric(point);
	}
	
	public boolean isGreatherOrEqualThan(ClosePoint point) {
		return isGreatherOrEqualGeneric(point);
	}
	
}
