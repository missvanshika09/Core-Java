public class ShapeWH
{
	public static void main(String[] args) {

		Shape rect = new Shape(5, 10);

		System.out.println("Width: " + rect.getWidth());
		System.out.println("Height: " + rect.getHeight());
	}
}


	class Shape {
		private int width;
		private int height;

		public Shape(int width, int height) {
			this.width = width;
			this.height = height;
		}
		
		public void setWidth(int width) {
			if (width >= 0) {
				this.width = width;
			} else {
				System.out.println("Width must be non-negative.");
			}
		}

		public int getWidth() {
			return width;
		}

		public void setHeight(int height) {
			if (height >= 0) {
				this.height = height;
			} else {
				System.out.println("Height must be non-negative.");
			}
		}

		

		public int getHeight() {
			return height;
		}


	}
