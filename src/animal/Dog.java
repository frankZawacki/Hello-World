package animal;

public class Dog extends Animal {
	
	
	public Dog() {
		super(15);
		System.out.println("A dog has been created.");
	}
	
	public void eat() {
		System.out.println("The dog is eating.");
	}
	
	public void sleep() {
		System.out.println("The dog is sleeping.");
	}
	
	public void ruff() {
		System.out.println("A dog says Ruff, Ruff.");
	}
	
	public void run() {
		System.out.println("The dog runs.");
	}

}
