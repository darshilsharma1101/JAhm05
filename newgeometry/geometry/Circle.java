package geometry;

public class Circle {
	private int redius;
	private double pi=3.14;
	private double area;
	
	public Circle(int redius) {
		this.redius = redius;
	}

	public int getRedius() {
		return redius;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}
	public double getArea() {
		area = pi*redius*redius;
		return area;
	}
	public String toString() {
		return "Circle [redius=" + redius + ", pi=" + pi + ", area=" + area + "]";
	}
}
