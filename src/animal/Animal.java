package animal;

public abstract class Animal {
	
	private int age;

	public Animal(int age) {
		this.age = age;
		System.out.println("An animal has been creaed.");
	}
	public void sleep() {
		System.out.println("The animal is sleeping.");
	}
	
	public abstract void eat();

	public static void main(String[] args) {
 
		Dog d = new Dog();
		Cat c = new Cat();
		d.ruff();
		c.prancing();
		d.eat();
		c.eat();
		
		
//		//casting
//		Object dog = new Dog(); //create a dog as an object
//		Dog realDog = (Dog) dog; //cast dog as the class Dog() and put in Dog realDog
//		realDog.ruff();
//		
//		Object str = "est";
//		String realS = (String) str;//(dataTypeCastingToInParens) theOtherType
//		realS.getBytes();
		
		Dog doggy = new Dog();
		if (doggy instanceof Animal) {
			Animal animal = (Animal) doggy;
			animal.sleep();
						
		}
		doggy.sleep();
				
	}

}


