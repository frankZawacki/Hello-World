package starWarsInterfaces;

public class Hero implements Character {
	public String weapon = "lightsaber";

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("The hero attacks the enemy.");

	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		System.out.println("The hero heals you.");

	}
	
	public void draw() {
		System.out.println("The hero draws" + weapon + ".");
	}

}
