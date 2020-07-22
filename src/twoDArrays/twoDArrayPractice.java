package twoDArrays;

public class twoDArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int rowSize = 6;
		int colSize = 6;
		int[][] myArray = new int[rowSize][colSize];

		for(int i = 0; i < rowSize; i++) {

		    for(int j = 0; j < colSize; j++, count++) {
		        myArray[i][j] = count;
		    }
		}
		
		for(int i = 0; i < rowSize; i++) {

		    // print the row of space-separated values
		    for(int j = 0; j < colSize; j++) {
		        System.out.print(myArray[i][j] + " ");
		    }
		    // end of row is reached, print newline
		    System.out.println();
		}

	}

}
