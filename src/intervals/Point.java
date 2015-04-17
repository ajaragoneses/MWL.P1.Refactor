package intervals;

public abstract class Point {

	protected double value;
	
	public Point(Double value){
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	
	public abstract boolean isLessThan(Point point);
	public abstract boolean isLessThan(OpenPoint point);
	public abstract boolean isLessThan(ClosePoint point);
	public abstract boolean isGreatherThan(Point point);
	public abstract boolean isGreatherThan(OpenPoint point);
	public abstract boolean isGreatherThan(ClosePoint point);
	public abstract boolean isLessOrEqualThan(Point point);
	public abstract boolean isLessOrEqualThan(OpenPoint point);
	public abstract boolean isLessOrEqualThan(ClosePoint point);
	public abstract boolean isGreatherOrEqualThan(Point point);
	public abstract boolean isGreatherOrEqualThan(OpenPoint point);
	public abstract boolean isGreatherOrEqualThan(ClosePoint point);

	public abstract boolean intersects(Point point);
	public abstract boolean intersects(OpenPoint point);
	public abstract boolean intersects(ClosePoint point);
	
	
}
