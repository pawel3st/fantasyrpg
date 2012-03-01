import java.awt.Point;
import java.util.ArrayList;

import javax.swing.Icon;


public abstract class Cheesman {
	protected int playerId;
	protected Square square;
	protected ChessmanType chessType;
	protected Icon icon;
	
	
	public Cheesman() {
		// TODO Auto-generated constructor stub
	}
	
	void move(Point point) {
		
	}
	
	public abstract ArrayList<Square> avalibleMoves();
	
	
}
