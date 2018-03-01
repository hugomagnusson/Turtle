import java.util.Random;

import se.lth.cs.pt.window.SimpleWindow;

public class WildTurtle {
	
	public static void main(String[] args) {
		
		SimpleWindow w = new SimpleWindow(600, 600, "WildTurtle");
		Turtle t = new Turtle(w, 300, 300);
		Random rand = new Random();
		
		t.penDown();
		
		int i = 0;
		while (i < 1000) {
			
			t.forward(rand.nextInt(10) + 1);
			
			if(rand.nextBoolean())
				t.left(rand.nextInt(181));
			else
				t.left(-rand.nextInt(181));
			
			
		}
	}
}
