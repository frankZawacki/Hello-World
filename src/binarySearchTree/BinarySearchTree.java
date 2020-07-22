package binarySearchTree;

public class BinarySearchTree {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int tests = 100;
		for(int i = 0; i < tests; i++) {
			Tree t;
			if(i % 10 == 0) {
				t = testers.rndTree(0);
			}else {
				t = testers.rndTree(10);
			}
			testers.checkAddMemberCardinality(t, i);
			
		}
	}
}