package solution26;

import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Solution26 {

		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int actualDay = sc.nextInt();
		int actualMonth = sc.nextInt();
		int actualYear = sc.nextInt();
		int expectedDay = sc.nextInt();
		int expectedMonth = sc.nextInt();
		int expectedYear = sc.nextInt();

		int monthsLate = actualMonth - expectedMonth;
		int daysLate = actualDay - expectedDay;
		int yearLate = actualYear - expectedYear;
		int yearFine = 10000;
		int monthlyFine = 500;
		int dailyFine = 15;

		if(yearLate > 0) {
			System.out.println(yearFine);
		}else if((monthsLate > 0) && (yearLate == 0)) {
			System.out.println(monthsLate * monthlyFine);
		}else if((daysLate > 0) && (yearLate == 0)) {
			System.out.println(daysLate * dailyFine);
		}else {
			System.out.println("0");
		}
	}
}


