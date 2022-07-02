package kmypackage;

import java.util.Scanner;

public class DivisibilityBy11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		String stringvalue = sc.next();
		String firstfourvalue = stringvalue.substring(0,4);
		int lastvalue = Integer.parseInt(firstfourvalue.substring(firstfourvalue.length()-2));
		int restnumber =Integer.parseInt(firstfourvalue.substring(0,2));
		int sum = lastvalue + restnumber;
		System.out.println(sum);
if(sum%11==0) {
	System.out.println("Divisible By Eleven");
}else {
	System.out.println("Not Divisible By Eleven");
}
sc.close();
	}

}
