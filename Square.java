import java.awt.Color;
import java.awt.Point;

import javax.swing.JButton;


public class Square extends JButton{
	private Point coordinate;
	private boolean occupied = false;
	private CheesmanType cheesmanType = null;
	
	Square(Point coordinate, Color color) {
		this.coordinate = coordinate;
	}

	public Point getCoordinate() {
		return coordinate;
	}

	
	
	
}
