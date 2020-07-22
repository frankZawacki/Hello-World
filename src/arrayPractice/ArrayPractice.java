package arrayPractice;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {
	
	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			int item = array[i];
			System.out.print(item);
			if (i < array.length - 1) {
				System.out.print(", ");
			}			
		}
		System.out.println("]");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		//declaring, allocating, initializing.
		int[] intArray1;
		int[] intArray2 = new int[4];
		System.out.println(Arrays.toString(intArray2));
		int[] intArray3 = {5, 2, 9, 1, 3};
		
		String[] shoppingList = {"milk", "eggs", "butter"};
		
		intArray2[0] = 10;
		intArray2[1] = 8;
		intArray2[2] = 5;
		intArray2[3] = 10;
		
		//foreach loop
		for (String s : shoppingList) {
			System.out.println(s);
		}
		
		//get random index from array-- where the mod number is equal to the length of the array.
		System.out.println(Math.abs(rand.nextInt()) % 5);
		System.out.println(Math.abs(rand.nextInt()) % intArray2.length);

		
		System.out.println(Arrays.toString(intArray2));
		System.out.println(Arrays.toString(intArray3));
		
		printArray(intArray3);
		
		//array functions
		Arrays.sort(intArray2);
		
		//////////////////////
		// the number of elements we want to hold
		final int _arraySize = 4; 

		// our array declaration
		String[] stringArray = new String[_arraySize]; 

		for(int i = 0; i < _arraySize; i++) {
		    // assign value to index i
		    stringArray[i] = "This is stored in index " + i; 
		    
		    // print value saved in index i
		    System.out.println(stringArray[i]); 		    		    
		}
	
	}

}
