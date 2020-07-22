package starWarsInterfaces;

public class Enemy implements Character {
	public String weapon = "lightsaber";

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("The enemy attacks you.");

	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		System.out.println("The enemy is healing.");
	}
	
	public void draw() {
		System.out.println("The enemy draws his" + weapon + ".");
	}

}
