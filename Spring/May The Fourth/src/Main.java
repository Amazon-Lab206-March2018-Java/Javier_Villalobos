
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character vader=new Character("Darth Vader", 100, "I'm your father");
		Character luke= new Character("Luke Skywalker", 80, "Nooooooo");
		Character solo= new Character("Han Solo", 90, "You’ve never heard of the Millennium Falcon? … It’s the ship that made the Kessel run in less than 12 parsecs.");
		Character random = new Character();
		vader.introduce(luke);
		random.introduce(vader);
		solo.introduce(random);
	}
}
