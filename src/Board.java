
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paweł
 */
public class Board extends JFrame {
    ArrayList <Square> sqTable = new ArrayList<Square>();
    final int SIZE=700;
	Board() {
		Color color;
	    setSize(SIZE,SIZE);
	    setTitle("Szachy");
	    setLayout(new GridLayout(8,8));
	    setResizable(false);
	    for (int i = 0; i < 8 ; i++) {
	    	for (int j = 0; j < 8; j++) {
	    		if ((i+j)%2 == 0) {
					color = Color.WHITE;
				}
	    		else {
	    			color = Color.BLACK;
	    		}
				Square sq1 = new Square(new Point(i,j), color);
				sqTable.add(sq1);
				add(sq1);
			}
			
		}
	}

    
}
