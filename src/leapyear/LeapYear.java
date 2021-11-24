package leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year which you want to " + "check for the LEAP YEAR?");

		Scanner scYear = new Scanner(System.in);

		int year = scYear.nextInt();
		scYear.close();

		if (year >= 1000 && year <= 9999) {
			
			LeapYear leapYear = new LeapYear();
			leapYear.checkLeapYear(year);

		} else {
			System.out.println("Invalid input");
		}
	}

	public void checkLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Year " + year + " is the leap year");
		} else {
			System.out.println("Year " + year + " is not the leap year");
		}
	}
}