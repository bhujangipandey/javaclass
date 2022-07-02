package kmypackage;

import java.util.Scanner;

public class DivisibiltyBy13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		String stringValue = sc.next();
		String firstfourvalue = stringValue.substring(0,4);	
		String lastvalue = stringValue.substring(Divisibility.getLength(stringValue) - 1);
		int intNumber = Divisibility.getNumber(lastvalue);
		int multiply = Divisibility.getNumber(lastvalue)*4;
		System.out.println(multiply);
		int restvalue = Divisibility.getNumber(stringValue.substring(0,3));
		System.out.println(restvalue);
        int sum =restvalue+multiply;
        System.out.println(sum);
        if(sum%13==0) {
        	System.out.println("Divisible by 13");
        }else {
        	System.out.println("Not Divisible by 13");
        }
	}

}
