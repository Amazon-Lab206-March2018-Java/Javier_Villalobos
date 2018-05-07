
public class Character {
	private String name;
	private double weight;
	private String famous_saying;
	
	public Character(String name, double weight, String famous_saying) {
		this.name = name;
		this.weight = weight;
		this.famous_saying = famous_saying;
	}
	
	public Character() {
		this("Unknown",80,"Default");
	}
	
	public void introduce(Character character) {
		System.out.println("Hello, "+character.getName()+", I'm "+ name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getFamous_saying() {
		return famous_saying;
	}

	public void setFamous_saying(String famous_saying) {
		this.famous_saying = famous_saying;
	}


}
