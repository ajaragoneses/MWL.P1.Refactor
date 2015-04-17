package intervals;

public class OpenPoint extends Point{
	
	public OpenPoint(Double value) {
		super(value);
	}
	
	public boolean isLessThan(Point point) {
		return point.isGreatherOrEqualThan(this);
	}
	
	public boolean isLessThan(OpenPoint point){
		return value < point.getValue();
	}
	
	public boolean isLessThan(ClosePoint point){
		return value < point.getValue();
	}

	public boolean isGreatherThan(Point point) {
		return point.isLessOrEqualThan(this);
	}

	public boolean isGreatherThan(OpenPoint point) {
		return value > point.getValue();
	}
	
	public boolean isGreatherThan(ClosePoint point) {
		return value > point.getValue();
	}
	
	private boolean isLessOrEqualGeneric(Point point){
		return value <= point.getValue();
	}
	
	private boolean isGreatherOrEqualGeneric(Point point){
		return value >= point.getValue();
	}
	
	@Override
	public boolean isLessOrEqualThan(Point point) {
		return point.isGreatherOrEqualThan((OpenPoint)this);
	}
	
	public boolean isLessOrEqualThan(OpenPoint point) {
		return isLessOrEqualGeneric(point);
	}
	
	public boolean isLessOrEqualThan(ClosePoint point) {
		return isLessOrEqualGeneric(point);
	}

	@Override
	public boolean isGreatherOrEqualThan(Point point) {
		return point.isLessOrEqualThan((OpenPoint)this);
	}
	
	public boolean isGreatherOrEqualThan(OpenPoint point) {
		return isGreatherOrEqualGeneric(point);
	}
	
	public boolean isGreatherOrEqualThan(ClosePoint point) {
		return isGreatherOrEqualGeneric(point);
	}

	@Override
	public boolean intersects(Point point) {
		return point.intersects((OpenPoint)this);
	}

	@Override
	public boolean intersects(OpenPoint point) {
		return false;
	}

	@Override
	public boolean intersects(ClosePoint point) {
		return false;
	}
	
}
