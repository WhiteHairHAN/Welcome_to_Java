
public class Car {
	String color;
	int gear;
	int speed;
	
	public String toString()
	{
		return "Car [ color ="+color + " speed="+ speed+" gear= "+gear +"]";
	}
	
	void changeGear(int g)
	{
		gear = g;
	}
	
	void speedup()
	{
		speed = speed +10;
	}
	
	void speeddown()
	{
		speed = speed -10 ;
	}
	
}
