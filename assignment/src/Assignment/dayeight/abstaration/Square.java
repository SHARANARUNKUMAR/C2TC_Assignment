package Assignment.dayeight.abstaration;

public class Square extends Shape
{
	private float sides;
	public Square()
	{
		sides=2.0f;
	}
	
	public Square(float sides)
	{
		this.sides=sides;
	}
	
	@Override
	void calArea() {
		super.area=sides*sides;		
	}

}
