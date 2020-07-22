package solution6;

import java.io.*;
import java.util.*;

public class Solution6 {
	
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int T = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 0; i < T; i++) {
			String s = scanner.nextLine();
			String odd = "";
			String even = "";
			for(int j = 0; j < s.length(); j++) {
				if (j % 2 == 0) {
					even += s.charAt(j);
				}else if (j % 2 == 1) {
					odd += s.charAt(j);
				}
			}
			System.out.println(even + " " + odd);			
		}				
		scanner.close();
	}

}

