package Assignment.dayseven.overloading;

public class Point {

	
	private float x;


	private float y;
	
	
	public Point() {
		
		x=0.08f;
		System.out.println(x);
		y=0.07f;
	}
	public Point(float x) {
		this.x=x;
		this.y=x;
		
	}
	
	public Point(float x,float y) {
		this.x=x;
		this.y=x;
		
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
