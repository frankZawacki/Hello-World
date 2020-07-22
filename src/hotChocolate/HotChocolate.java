package hotChocolate;

public class HotChocolate {
	
	public static final double tooHot = 185;
	public static final double tooCold = 160;
	//public static final double cocoaTemp;
	
	public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, 
	TooColdException{
		if (cocoaTemp >= tooHot) {
			throw new TooHotException();
		}else if(cocoaTemp <= tooCold){
			throw new TooColdException();
		}else {
			System.out.println("Just Right!");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double currentCocoaTemp = 171;
		try {
			drinkHotChocolate(currentCocoaTemp);
			System.out.println("That cocoa was good.");
		}catch(TooHotException e1) {
			System.out.println("That's too hot.");
		}catch(TooColdException e2) {
			System.out.println("That's too cold.");
		}

	}

}
