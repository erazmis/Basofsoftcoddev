import java.awt.Point;
import java.util.Random;

public class Subroutines_4ver1 {
	
	public static void main(String[] args) {
		Point[] array = new Point[10];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = new Point(rand.nextInt(101), rand.nextInt(101));
			System.out.printf("(%d, %d); ", array[i].x, array[i].y);
		}

		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 0);
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (p1.distance(p2) < array[i].distance(array[j])) {
					p1 = array[i];
					p2 = array[j];
				}
			}
		}

		System.out.printf("\np1: %s, p2: %s, distance: %s", p1, p2, p1.distance(p2));
	}
}
