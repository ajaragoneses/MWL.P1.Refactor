package intervals;

public abstract class Point {

	protected double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public abstract boolean isLessThan(Point point);
	public abstract boolean isGreatherThan(Point point);
	public abstract boolean isLessOrEqualThan(Point point);
	public abstract boolean isGreatherOrEqualThan(Point point);
	
	
}
