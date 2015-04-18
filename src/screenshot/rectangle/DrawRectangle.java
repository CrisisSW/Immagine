package screenshot.rectangle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawRectangle extends JPanel {

	private RectangleData data = new RectangleData();	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillRect(data.getStartingPointX(), data.getStartingPointY(), data.getWidth(), data.getHeight());
		
	}
}
