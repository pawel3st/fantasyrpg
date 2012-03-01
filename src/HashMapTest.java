import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;


public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Point, Square> map = new HashMap<Point, Square>();
		map.put(new Point(10,20), new Square(new Point(10,20), Color.BLACK));
	}
}
