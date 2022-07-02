package Day2Arrays;

import java.util.Scanner;

public class LeapYearArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");
		String date = sc.next();
		Checkdatepettern(date);
		CheckleapyearOrNot(date);
	}

	private static void CheckleapyearOrNot(String date) {
		String[] dateArray = date.split("-");
		int year = Integer.parseInt(dateArray[dateArray.length - 1]);
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("leap year");
				} else {
					System.out.println("not leap year");
				}

			} else {
				System.out.println("laep year");
			}
		} else {
			System.out.println("not leap year");
		}
	}

	private static void Checkdatepettern(String date) {
		if (date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-([0-9]{4})$")) {
			System.out.println("it is date pattern");
		} else {
			System.out.println("no it is not date pattern");
		}
	}
}
