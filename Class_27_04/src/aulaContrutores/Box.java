package aulaContrutores;

public class Box {
	//attributes
	
	private double height;
	private double width;
	private double depth;
	
	//getters and setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	//constructor
	public Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public Box() {
		height = 10;
		width = 10;
		depth = 10;
	}
	
	public double calcVolume() {
		double result = height * width * depth;
		return result;
	}

}
