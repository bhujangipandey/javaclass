package Day2Arrays;

import java.util.Scanner;

public class CheckDateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date ");
		String date = sc.next();
		if(Checkleapyeardateforfebuary(date)) {
			System.out.println("it is valid date");
		}else {
			System.out.println("it not valid date");
		}
		sc.close();
	}

	private static boolean Checkleapyeardateforfebuary(String date) {
		int month = 0;
		int datevalue = 0;
		if (checkdatepattern(date)) {
			month = getMonth(date);
			datevalue = getDate(date);
		}
		if (CheckleapyearOrNot(date)) {
			if (month == 2) {
				if (datevalue <= 29) {
					return true;
				} else {
					return false;
				}
			}

		} else {
			if (month == 2) {
				if (datevalue <= 28) {
					return true;
				} else {
					return false;
				}
			}
		}

		return false;
	}

	public static int getDate(String date) {
		String[] dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length - 3]);
	}

	public static int getMonth(String date) {
		String[] dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length - 2]);
	}

	public static boolean CheckleapyearOrNot(String date) {
		if (checkdatepattern(date)) {
			String[] dateArray = date.split("-");
			int year = Integer.parseInt(dateArray[dateArray.length - 1]);
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						return true;
					} else {
						return false;
					}

				} else {
					return true;
				}
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

	 public static boolean checkdatepattern(String date) {
		if (date.matches("^((0[1-9])|(1[0-9])|(2[0-9])-(3[0-1]))-((0[1-9])|(1[0-2]))-([0-9]{4})$")) {
			return true;
		} else {
			return false;
		}

	}

}
