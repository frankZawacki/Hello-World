package solution25;

import java.io.*;
import java.util.*;

public class Solution25 {

	public static String primality(int num) {
		
		if(num == 2) {
			return "Prime";
		}
		if((num % 2 == 0) && (num != 2) || (num == 1)) {
			return "Not prime";
		} 		
		for(int i = 3; i <= (num/2); i += 2) {
			if(num % i == 0) {
				return "Not prime";
			}
		}
		return "Prime";
	}
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		for(int i = 0; i < T; i++){
        	int n = sc.nextInt();
        	System.out.println(primality(n));
        }
						
    }

}