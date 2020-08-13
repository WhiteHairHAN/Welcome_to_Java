
public class Car {
	private String model;
	public Car(String mode) {
		this.model = mode;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Car)
		{
			return model.equals(((Car)obj).model);
		}
		else
			return false;
	}
}

