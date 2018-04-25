
public class Samurai extends Human {
	
	protected static int number = 0;
	
	public Samurai() {
		number+=1;
		this.health=200;
	}
	
	public void deathBlow(Human human){
		human.setHealth(0);
		this.health /=2;
	}
	public void meditate() {
		this.health*=2;
	}
	public static int howMany() {
		return number;
	}
	
}
