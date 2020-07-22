package madlibs;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {
	
	Scanner scanner = new Scanner(System.in);
	String story;
	String name;
	String adjective1;
	String adjective2;
	String noun1;
	String noun2;
	String noun3;
	String adverb;
	String randomNum;
	Random rand = new Random();

	//Getters
	
	public String getStory() {
		return this.story;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAdjective1() {
		return this.adjective1;
	}
	
	public String getAdjective2() {
		return this.adjective2;
	}
	
	public String getNoun1() {
		return this.noun1;
	}
	
	public String getNoun2() {
		return this.noun2;
	}

	public String getNoun3() {
		return this.noun3;
	}
	
	public String getAdverb() {
		return this.adverb;
	}
	
	public String getRandomNum() {
		return this.randomNum;
	}
	
	//Setters
	
	public void setStory(String newStory) {
		this.story = newStory;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAdjective1(String newAdjective1) {
		this.adjective1 = newAdjective1;
	}
	
	public void setAdjective2(String newAdjective2) {
		this.adjective2 = newAdjective2;
	}
	
	public void setNoun1(String newNoun1) {
		this.noun1 = newNoun1;
	}
	
	public void setNoun2(String newNoun2) {
		this.noun2 = newNoun2;
	}

	public void setNoun3(String newNoun3) {
		this.noun3 = newNoun3;
	}
	
	public void setAdverb(String newAdverb) {
		this.adverb = newAdverb;
	}
	
	public void setRandomNum() {
		int num = Math.abs(rand.nextInt()) % 1000;
		int index =0;
		int[] numberHolder = new int[3];
		while(index < numberHolder.length) {
			numberHolder[index] = num + index;
			index++;
			
		}
		randomNum = "not " + numberHolder[0] + " not " + numberHolder[1]
				+ " but " + numberHolder[2];
	}
	
	
	public void printInstructions() {
		System.out.println("Weolcome to the MadLibs game. If you type in words"
				+ "we'll give you a story. Start by typing a name.");
	}
	
	public void enterName() {
		setName(scanner.nextLine());
	}
	
	public void enterNoun1() {
		System.out.println("Give me a noun.");
		setNoun1(scanner.nextLine());
	}
	
	public void enterNoun2() {
		System.out.println("Give me a noun.");
		setNoun2(scanner.nextLine());
	}
	
	public void enterNoun3() {
		System.out.println("Give me a noun.");
		setNoun3(scanner.nextLine());
	}
	
	public void enterAdjective1() {
		System.out.println("Give me an adjective.");
		setAdjective1(scanner.nextLine());
	}
	
	public void enterAdjective2() {
		System.out.println("Give me an adjective.");
		setAdjective2(scanner.nextLine());
	}
	
	public void enterAdverb() {
		System.out.println("Give me an adverb.");
		setAdverb(scanner.nextLine());
	}
	
	
	public void play() {
		enterName();
		enterNoun1();
		enterNoun2();
		enterNoun3();
		enterAdjective1();
		enterAdjective2();
		enterAdverb();
		setRandomNum();
		putTogetherTheStory();
		System.out.println(getStory());
	}
	
	
	
	
	public void putTogetherTheStory() {
		String story = "Jesse and her best friend " + getName() + "went to Disney Worlkd today."
				+ "They saw a " + getNoun1() + "in a show at the Magic Kingdom."
						+ "And ate a " + getAdjective1() + "feast for dinner. The"
								+ "next day I ran " + getAdverb() + "to meet Mickey"
										+ "in his " + getNoun2() + "And then that night I "
												+ "gazed at the " + getRandomNum() + " " + getAdjective2() + 
												" fireworks shoting from the " + getNoun3() + "!";
		setStory(story);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MadLibs game = new MadLibs();
		game.printInstructions();
		game.play();
		
		

	}

}
