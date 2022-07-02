package kmypackage;

import java.util.Scanner;

public class DivisibilityBy12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		String stringValue = sc.next();
		String firstfourvalue = stringValue.substring(0,4);
		String lastvalue = stringValue.substring(Divisibility.getLength(stringValue) - 1);
		int intNumber = Divisibility.getNumber(lastvalue);
		System.out.println(intNumber); 
		int firstnum = Divisibility.getNumber(stringValue.substring(0,1));
		int secondnum = Divisibility.getNumber(stringValue.substring(1,2));
		int thirdnum = Divisibility.getNumber(stringValue.substring(2,3));
		
		int sum =firstnum +secondnum +thirdnum+intNumber;
		System.out.println(sum);
		if (sum % 3 == 0 && sum % 4 == 0) {
			System.out.println("divisible by 12");
		} else {
			System.out.println("not divisible by 12");
		}
		sc.close();
	}
}
