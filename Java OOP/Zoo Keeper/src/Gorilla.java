
public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something");
		super.setEnergyLevel(-5);
	}
	public void eatBananas() {
		System.out.println("The gorilla has eaten bananas");
		super.setEnergyLevel(10);
	}
	public void climb() {
		System.out.println("The gorilla has climbed");
		super.setEnergyLevel(-10);
	}
}
