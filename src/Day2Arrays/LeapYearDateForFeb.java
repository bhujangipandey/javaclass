package Day2Arrays;

import java.util.Scanner;

public class LeapYearDateForFeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("enter the date");
String date =sc.next();
if(checkLeapYearDateForFebruary(date)) {
	System.out.println("it is date value");
}else {
	System.out.println("no it is not date value");
}

sc.close();

checkLeapYearDateForFebruary(date);
	}

	private static boolean checkLeapYearDateForFebruary(String date) {
		int dateValue=0;
		int month=0;
		if(CheckDateValue.checkdatepattern(date)) {
			month=getMonth(date);
			dateValue=getDate(date);
			}
		if(CheckDateValue.CheckleapyearOrNot(date)) {
			if(month==2) {
				if(dateValue<=29) {
					return true;
				}else {
					return false;
				}
			}
			
		}else {
			if(month==2) {
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
		String[] dateArray=date.split("-");
		return Integer.parseInt(dateArray[dateArray.length-3]);
		
	}

	public static int getMonth(String date) {
		String[] dateArray=date.split("-");
		return Integer.parseInt(dateArray[dateArray.length-2]);
	}
		
	}
	

