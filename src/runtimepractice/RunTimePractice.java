package runtimepractice;

import java.util.HashMap;

public class RunTimePractice {
	
	//LINEAR TIME O(n)
	public static int findNumRepititions(String s, char c) {
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				sum++;				
			}
		}
		return sum;		
	}
	
	//(~quadratic time) O(n*m) (quadratic  time is really O(n*n) or O(n^2)
	public static int[] findNumRepetitionsv1(String s, char[] c) {
		int[] sums = new int[c.length];
		for(int i = 0; i < s.length(); i ++) {
			for(int j = 0; j < c.length; j++) {
				if(s.charAt(i) ==c[j]) {
					sums[j] = sums[j] + 1;
				}
			}
		}
		return sums;
	}
	
	//
	public static int[] findNumRepititionsv2(String s, char[] c) {
		int[] sums = new int[c.length];
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}else {
				int sum = map.get(s.charAt(i));
				map.put(s.charAt(i), sum + 1);
			}
		}
		for (int j = 0; j < c.length; j++) {
			int sum;
			if (!map.containsKey(c[j])) {
				sums[j] = 0;
			}else {
				sums[j] = map.get(c[j]);
			}
		}
		return sums;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		
		findNumRepititions("blah blah blah", 'b');
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		System.out.println("Test" + duration);

	}

}
