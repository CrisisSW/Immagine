package screenshot.rectangle;

public class RectangleData {

	private int startingPointX, startingPointY;
	private int endingPointX, endingPointY;
	private int width, height;

	// Accessors
	public int getStartingPointX() {
		return startingPointX;
	}

	public int getStartingPointY() {
		return startingPointY;
	}

	public int getEndingPointX() {
		return endingPointX;
	}

	public int getEndingPointY() {
		return endingPointY;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void calculateWidthAndHeight() {
		width = endingPointX - startingPointX;
		height = endingPointY - startingPointY;

		if (width < 0) {
			System.out.println("Yep, width");
			width += (-width + -width);
		}

		if (height < 0) {
			System.out.println("Yep, height");
			height += (-height + -height);
		}

	}

	// Mutator
	public int setStartingPointX(int startingPointX) {
		return startingPointX;
	}

	public int setStartingPointY(int startingPointY) {
		return startingPointY;
	}

	public int setEndingPointX(int endingPointX) {
		return endingPointX;
	}

	public int setEndingPointY(int endingPointY) {
		return endingPointY;
	}
	
	public int setWidth(int width) {
		return width;
	}
	
	public int setHeight(int height) {
		return height;
	}
}
