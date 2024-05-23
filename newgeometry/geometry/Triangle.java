package geometry;

public class Triangle {
		private double bridth;
		private double height;
		private double area;
		
		public Triangle(double bridth, double height) {
			super();
			this.bridth = bridth;
			this.height = height;
		}
		
		public double getBridth() {
			return bridth;
		}
		public void setBridth(double bridth) {
			this.bridth = bridth;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getArea() {
			area = (bridth*height)/2;
			return area;
		}

		@Override
		public String toString() {
			return "Triangle [bridth=" + bridth + ", height=" + height + ", area=" + area + "]";
		}
			
		
}
