package kmypackage;

import java.util.Scanner;

public class DivisibiltyBy9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		String stringvalue = sc.next();
		int firstvalue =Integer.parseInt(stringvalue.substring(0,1));
		int secondvalue =Integer.parseInt(stringvalue.substring(1,2));
	    int thirdvalue =Integer.parseInt(stringvalue.substring(2,3));
	    int fourthvalue =Integer.parseInt(stringvalue.substring(3,4));
	    int fifthvalue =Integer.parseInt(stringvalue.substring(4,5));
		int sum = firstvalue+secondvalue+thirdvalue+fourthvalue+fifthvalue;
		System.out.println(sum);
		if(sum%9==0) {
			System.out.println("Divisible By Nine");
		}else {
			System.out.println("Not Divisible By Nine");
		}
		sc.close();
	}
}
