public class Octagon extends GeometricObject implements Cloneable, Comparable {
	private double side;
	
	public Octagon (double side) {
		this.side = side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getArea() {
		return (2 + (4/Math.sqrt(2))) * side * side;
	}
	
	public double getPerimeter() {
		return 8 * side;
	}
	
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
  
	public int compareTo(Octagon oct) { 
		if (getSide() == oct.getSide()) {
		  return 0;
		}
		else {
			return 1;
		}
	}
}
