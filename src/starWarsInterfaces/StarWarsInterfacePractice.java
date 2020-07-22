package starWarsInterfaces;

import java.util.Random;

public class StarWarsInterfacePractice {
	
	public static Character summonCharacter() {
		Random rand = new Random();
		if(Math.abs(rand.nextInt()) % 2 == 0) {
			return new Enemy();
		}else {
			return new Hero();
		}
	}
	
	public static void main(String[] args) {
		Enemy darthVader = new Enemy();
		Hero obiWanKenobi = new Hero();
		darthVader.attack();
		obiWanKenobi.attack();
		darthVader.heal();
		obiWanKenobi.heal();
		Character spy = summonCharacter();
		
	}

}
