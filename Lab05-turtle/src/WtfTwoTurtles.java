import java.util.Random;

import se.lth.cs.pt.window.SimpleWindow;

public class WtfTwoTurtles {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "WildTurtles");
		Turtle t1 = new Turtle(w, 250, 250);
		Turtle t2 = new Turtle(w, 350, 350);
		Random rand = new Random();
		
		t1.penDown();
		t2.penDown();
		
		int i = 0;
		//while (Math.sqrt(Math.pow(t1.getX() - t2.getX(), 2) + Math.pow(t1.getY() - t2.getY(), 2)) > 50 ) {
		while (Math.hypot(t1.getX() - t2.getX(), t1.getY() - t2.getY()) > 50) {
			
			t1.forward(rand.nextInt(10) + 1);
			t2.forward(rand.nextInt(10) + 1);
			
			
			if(rand.nextBoolean())
				t1.left(rand.nextInt(181));
			else
				t1.left(-rand.nextInt(181));
			
			if(rand.nextBoolean())
				t2.left(rand.nextInt(181));
			else
				t2.left(-rand.nextInt(181));
			
			
		}

		
		
	}
}
