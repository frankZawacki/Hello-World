package guessTheNumber;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GuessTheNumber {
	
	int theNUMBER;
	int max;
	Scanner scanner = new Scanner(System.in);
	
	
	public GuessTheNumber() {
		Random rand = new Random();
		max = 100;
		theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
		
		
	}
	
	public void play() {
		while (true) {
			int move = scanner.nextInt();
			if (move > theNUMBER) {
				System.out.println("Your number is too big.");
			} else if (move < theNUMBER) {
				System.out.println("Your number is too small.");
			} else {
				System.out.println("You got the number.");
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		GuessTheNumber guessGame = new GuessTheNumber();
		System.out.println("Welcome to my game. Guess the number, it's between 1 and 100. "
				+ "Just type a number to get started.");
		guessGame.play();

	}

}
