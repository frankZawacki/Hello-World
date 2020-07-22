package car;

public class Car {
	
	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079;
	
	boolean isCarOn = false;
	char condition = 'A';
	String nameOfCar = "Lucy";
	
	double maxFuel = 16;
	double currentFuel = 8;
	double mpg = 26.4;
	int numPeopleInCar = 1;
	int maxNumPeopleInCar = 6;
	
	public Car() {
		
	}
	
	public Car(int customMaxSpeed, double customWeight, boolean customIsCarOn) {
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isCarOn = customIsCarOn;
		
	}
	
	public void setMaxSpeed(int newMaxSpeed) {
		this.maxSpeed = newMaxSpeed;
	}
	
	public void setWeight(double newWeight) {
		this.weight = newWeight;
	}
	
	public void setCondition(char newCondition) {
		this.condition = newCondition;
	}
	
	public void setCurrentFuel(double newCurrentFuel) {
		this.currentFuel = newCurrentFuel;
	}
	
	public void setMpg(double newMpg) {
		this.mpg = newMpg;
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public int getMinSpeed() {
		return this.minSpeed;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public char getCondition() {
		return this.condition;
	}
	
	public double getMaxFuel() {
		return this.maxFuel;				
	}
	
	public double getCurrentFuel() {
		return this.currentFuel;
	}
	
	public double getMpg() {
		return this.mpg;
	}
	
	public void printVariables() {
		System.out.println(maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isCarOn);
		System.out.println(condition);
		
	}
	
	public void wreckCar() {
		condition = 'C';
	}
	
	public void upgradeMaxSpeed() {
		setMaxSpeed(getMaxSpeed() +10);
	}
	
	public void getIn() {
		if (numPeopleInCar < maxNumPeopleInCar) {
			numPeopleInCar++;
		}
		else {
			System.out.println("The car is already full.");
		}
	}
	
	public void getOut() {
		if (numPeopleInCar > 0) {
			numPeopleInCar--;	
		}
		else {
			System.out.println("The car is already empty.");
		}
	}
	
	public double milesTilOutOfGas() {
		return currentFuel * mpg;
	}
	
	public void turnCarOn() {
		if (isCarOn == false) {
			isCarOn = true;
		}
		else {
			System.out.println("The car is already on.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car familyCar = new Car();
//		familyCar.printVariables();
//		Car aliceCar = familyCar;
//		aliceCar.printVariables();
//		familyCar.wreckCar();
//		aliceCar.printVariables();
		
//		Car birthdayCar = new Car(200, 9999.5, true);
//		birthdayCar.printVariables();

		Car tommyCar = new Car();
		tommyCar.getOut();
		tommyCar.getOut();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.turnCarOn();
		tommyCar.turnCarOn();
	}

}
