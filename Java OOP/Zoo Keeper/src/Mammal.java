public class Mammal {
	private int energyLevel;

	public Mammal() {
		this.energyLevel = 100;
	}
	public int getEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	public void setEnergyLevel(int energy) {
		this.energyLevel += energy;
	}
}
