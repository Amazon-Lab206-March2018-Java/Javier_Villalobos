
public class Ninja extends Human {

	public Ninja() {
		this.stealth=10;
	}
	public void steal(Human human) {
		this.health+=this.stealth;
		human.setHealth(human.getHealth()-this.stealth);
	}
	public void runAway() {
		this.health-=10;
	}

}
