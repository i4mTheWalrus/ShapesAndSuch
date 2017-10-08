/**
 * @author Tyler Race
 * This is a class used a base class for other shapes.
 */
public class Shape {
	private double area;
	private int xPos, yPos;
	private String color;
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void moveShape(int newXPos, int newYPos) {
		xPos = newXPos;
		yPos = newYPos;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getXPos() {
		return xPos;
	}
	
	public int getYPos() {
		return yPos;
	}
	
	//public void setArea(double newArea);
	public double getArea() {
		return area;
	}
}
