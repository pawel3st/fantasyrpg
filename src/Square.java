import java.awt.Color;
import java.awt.Point;

import javax.swing.JButton;


public class Square extends JButton{
	private Point coordinate;
	private boolean occupied = false;
	private ChessmanType cheesmanType = null;
	
	Square(Point coordinate, Color color) {
		this.coordinate = coordinate;
	}

	public Point getCoordinate() {
		return coordinate;
	}

	public ChessmanType getCheesmanType() {
		return cheesmanType;
	}

	public void setCheesmanType(ChessmanType cheesmanType) {
		this.cheesmanType = cheesmanType;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	

	
	
	
}
