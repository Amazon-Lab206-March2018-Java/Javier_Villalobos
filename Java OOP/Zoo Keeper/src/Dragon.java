
public class Dragon {
	private int energyLevel;
	
	public Dragon() {
		this.energyLevel = 300;
	}
	public void fly() {
		System.out.println("The Dragon is flying");
		this.setEnergyLevel(-50);
	}
	public void eatHumans() {
		System.out.println("The Dragon has eaten humans");
		this.setEnergyLevel(25);
	}
	public void attackTown() {
		System.out.println("The Dragon has attacked a town");
		this.setEnergyLevel(-100);
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel += energyLevel;
	}
	
}
