package adv.model;

public abstract class Car implements Flammable
{
	String name;
	int speed;
	int flammability;
	
	public Car(String name, int speed)
	{
		this.name = name;
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return "[name = " + this.name + ", speed = " + this.speed + "]";
	}
}
