package kmypackage;

import java.util.Scanner;

public class DivisibleBy16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number");
String stringvalue =sc.next();
String lasttwovalue=stringvalue.substring(Divisibility.getLength(stringvalue)-2);
int intNumber=Divisibility.getNumber(lasttwovalue);
System.out.println(intNumber);
if(intNumber %2==0 && intNumber%4==0) {
	System.out.println("Divisible by 16");
}else {
	
	System.out.println("Not divisible by 16");
}
	}

}
