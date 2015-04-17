package intervals;

public class ClosePoint extends Point{

	public ClosePoint(Double value) {
		super(value);
	}

	public boolean isLessThan(Point point) {
		return point.isGreatherThan((ClosePoint)this);
	}
	
	public boolean isLessThan(OpenPoint point){
		return value < point.getValue();
	}
	
	public boolean isLessThan(ClosePoint point){
		return value < point.getValue();
	}

	public boolean isGreatherThan(Point point) {
		return point.isLessThan((ClosePoint)this);
	}

	public boolean isGreatherThan(OpenPoint point) {
		return value > point.getValue();
	}
	
	public boolean isGreatherThan(ClosePoint point) {
		return value > point.getValue();
	}
	
	@Override
	public boolean isLessOrEqualThan(Point point) {
		return point.isGreatherOrEqualThan((ClosePoint)this);
	}
	
	public boolean isLessOrEqualThan(OpenPoint point) {
		if(value == point.value) return false;
		return value < point.getValue();
	}
	
	public boolean isLessOrEqualThan(ClosePoint point) {
		if(value == point.value) return true;
		return value < point.getValue();
	}

	@Override
	public boolean isGreatherOrEqualThan(Point point) {
		return point.isLessOrEqualThan((ClosePoint)this);
	}
	
	public boolean isGreatherOrEqualThan(OpenPoint point) {
		if(value == point.value) return false;
		return value > point.getValue();
	}
	
	public boolean isGreatherOrEqualThan(ClosePoint point) {
		if(value == point.value) return true;
		return value > point.getValue();
	}

	@Override
	public boolean intersects(Point point) {
		return point.intersects((ClosePoint)this);
	}

	@Override
	public boolean intersects(OpenPoint point) {
		return false;
	}

	@Override
	public boolean intersects(ClosePoint point) {
		return true;
	}
}
