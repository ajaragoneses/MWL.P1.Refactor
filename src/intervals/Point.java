package intervals;

public abstract class Point {

	protected double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public boolean isLessThan(Point point) {
		return point.isGreatherThan(this);
	}
	
	public boolean isLessThan(OpenPoint point){
		return value < point.getValue();
	}
	
	public boolean isLessThan(ClosePoint point){
		return value < point.getValue();
	}

	public boolean isGreatherThan(Point point) {
		return point.isLessThan(this);
	}

	public boolean isGreatherThan(OpenPoint point) {
		return value > point.getValue();
	}
	
	public boolean isGreatherThan(ClosePoint point) {
		return value > point.getValue();
	}
	
	public abstract boolean isLessOrEqualThan(Point point);
	public abstract boolean isGreatherOrEqualThan(Point point);
	
	
}
