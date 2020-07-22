package binarySearchTree;

import java.util.Random;

public class testers {
	
	//random ints
	public static int rndInt(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
		//min = 5, max = 15
		//15-5 = 10 +1 == 11 --> 0 to 10; 
		// +5 to this random number;
	}
	
	//random trees
	public static Tree rndTree(int count) {
		if(count == 0) {
			return new EmptyBST();
		}else {
			return rndTree(count - 1).add(rndInt(0, 50));
		}
	}
	
	
	
	
	public static void checkIsEmpty(Tree t) {
		//if t Tree is an instanceof EmptyBST --> t.isEmpty --> true
		//if t Tree is an instanceof NonEmptyBST --> t.isEmpty --> false
		if (t instanceof EmptyBST) {
			if(t.isEmpty()) {
				System.out.println("Good, the EmptyBST should be empty.");
			}
		}else if(t instanceof NonEmptyBST) {
			if(!t.isEmpty()) {
				System.out.println("Good, the NonEmptyBST should not be empty.");
			}
		}
		
	}
	
	public static void checkAddMemberCardinality(Tree t, int x) throws Exception{
		int nT = (t.add(x).cardinality());
		//either 
		//1.something was added--> and the cardinality was increased by one
		if(nT == t.cardinality() + 1) {
			if(t.member(x)) {
				throw new Exception("The cardinality increased by 1, but the thing "
						+ "that was added was already there.");
			}
			//OR
			//2. the item added was already there so cardinality stayed the same
		}else if(nT == t.cardinality()) {
			if(!t.member(x)) {
				throw new Exception("The cardinality didn't increase, but something "
						+ "was addedd.");
			}
		}else {
			throw new Exception("Something is wrong.");
		}
		
	}


}
