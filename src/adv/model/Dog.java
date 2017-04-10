package adv.model;

public abstract class Dog implements Flammable {
	String name;
	int weight;
	int flammability;
	
	public Dog(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "[name = " + this.name + ", weight = " + this.weight + "]";
	}
}
