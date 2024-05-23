package geometry;

public class Rectangle {
	private int length;
	private int bridth;
	private int area;
	
	public Rectangle(int length, int bridth) {
		super();
		this.length = length;
		this.bridth = bridth;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBridth() {
		return bridth;
	}
	public void setBridth(int bridth) {
		this.bridth = bridth;
	}
	public int getArea() {
		area = length* bridth;
		return area;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", bridth=" + bridth + ", area=" + area + "]";
	}
	
	
}
