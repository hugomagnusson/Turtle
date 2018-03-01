import se.lth.cs.pt.window.SimpleWindow;

public class Turtle {
	
	/*
	 * Attribut: 				angle 			kan användas i hela Turtle.class
	 * 
	 * Formell parameter:		beta			kan endast användas i left()
	 * 
	 * Lokal variabel:			finns ej		kan endast användas i metoden de deklarerades i
	 */

	private SimpleWindow w;
	private double x, y;
	private double angle;
	private boolean penDown;
	
	
	/** Skapar en sköldpadda som ritar i ritfönstret w. Från början 
	    befinner sig sköldpaddan i punkten x, y med pennan lyft och 
	    huvudet pekande rakt uppåt i fönstret (i negativ y-riktning). */
	public Turtle(SimpleWindow w, int x, int y) {

		this.w = w;
		this.x = x;
		this.y = y;
		angle = 90;
		penDown = false;
		w.moveTo(x, y);
		
	}

	/** Sänker pennan. */
	public void penDown() {
		penDown = true;
	}
	
	/** Lyfter pennan. */
	public void penUp() {
		penDown = false;
	}
	
	/** Går rakt framåt n pixlar i den riktning huvudet pekar. */
	public void forward(int n) {
		
		w.moveTo((int)Math.round(x), (int)Math.round(y));
		
		x = x + Math.cos(Math.toRadians(angle)) * n;
		y = y - Math.sin(Math.toRadians(angle)) * n;
		
		
		
		if (penDown)
			w.lineTo((int)Math.round(x), (int)Math.round(y));
		
		//SimpleWindow.delay(1000);
	}

	/** Vrider beta grader åt vänster runt pennan. */
	public void left(int beta) {
		angle = angle + beta;
	}

	/** Går till punkten newX, newY utan att rita. Pennans läge (sänkt
	    eller lyft) och huvudets riktning påverkas inte. */
	public void jumpTo(int newX, int newY) {
		x = newX;
		y = newY;
	}

	/** Återställer huvudriktningen till den ursprungliga. */
	public void turnNorth() {
		angle = 90;
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position. */
	public int getX() {
		return (int)Math.round(x);
	}

 	/** Tar reda på y-koordinaten för sköldpaddans aktuella position. */
	public int getY() {
		return (int)Math.round(y);
	}
  
	/** Tar reda på sköldpaddans riktning, i grader från den positiva X-axeln. */
 	public int getDirection() {
 		return (int)Math.round(angle);
	}
}
