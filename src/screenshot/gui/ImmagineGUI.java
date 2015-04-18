package screenshot.gui;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputListener;

import screenshot.rectangle.DrawRectangle;
import screenshot.rectangle.RectangleData;

@SuppressWarnings("serial")
public class ImmagineGUI extends JFrame implements MouseInputListener {

	// Dimension
	private final Dimension screenSize = Toolkit.getDefaultToolkit()
			.getScreenSize();

	// JPanel
	private final DrawRectangle rectanglePanel = new DrawRectangle();

	// RectangleData
	private final RectangleData rectangleData = new RectangleData();

	// Mouse
	private Point mousePosition;

	// Constructor
	public ImmagineGUI() {
		init(); // Initialize JFrame
		mouse(); // Edit mouse cursor + addMouseInputListener
		setVisible(true);
	}

	private void mouse() {
		setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	private void init() {
		setSize(screenSize.width, screenSize.height);
		add(rectanglePanel);
		setUndecorated(true);
		setOpacity(0.1f);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent event) {
		if (SwingUtilities.isLeftMouseButton(event)) {
			mousePosition = MouseInfo.getPointerInfo().getLocation();
			rectangleData.setStartingPointX(mousePosition.x);
			rectangleData.setStartingPointY(mousePosition.y);
		}

	}

	@Override
	public void mouseReleased(MouseEvent event) {
		if (SwingUtilities.isLeftMouseButton(event)) {
			mousePosition = MouseInfo.getPointerInfo().getLocation();
			rectangleData.setEndingPointX(mousePosition.x);
			rectangleData.setEndingPointY(mousePosition.y);
			rectangleData.calculateWidthAndHeight();
			repaint();
		} else {
			System.exit(0);
		}

	}

	@Override
	public void mouseDragged(MouseEvent event) {
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
}
