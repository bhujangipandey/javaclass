package leapyear;

import java.util.Scanner;

public class LeapYearForFeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		String date = sc.next();
		sc.close();
//		checkdatepattern(date);
//		checkLeapYearOrNot(date);
//		checkLeapYearDateForFebruary(date);
		if(checkLeapYearDateForFebruary(date)){
		System.out.println(" yes it is date value");
		}else {
			System.out.println("No it is not date value");
		}
			}
		

	private static boolean checkLeapYearDateForFebruary(String date) {
		int dateValue = 0;
		int Month = 0;
		if(checkdatepattern(date)){
			Month = getMonth(date);
			dateValue = getDate(date);
		}
		if(checkLeapYearOrNot(date)) {
			if(Month==2) {
				if(dateValue<=29) {
					return true;
				}else {
					return false;
				}
			}
			}else {
				if(Month==2) {
					if(dateValue<=28) {
						return true;
					}else {
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

	private static boolean checkLeapYearOrNot(String date) {
		if(checkdatepattern(date)) {
		String[]dateArray = date.split("-");
		int year = Integer.parseInt(dateArray[dateArray.length-1]);
		if(year %4 ==0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}else {
					return false;
				}
				
			}else {
				return true;
			}
			}else {
				return false;
	
		}
		
	}else{
		return false;
	
		
	}
	
	}
		

	private static boolean checkdatepattern(String date) {
		if (date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[1-2]))-([0-9]{4})$")) {
			return true;
		} else {
			return false;
		}
	}
}
