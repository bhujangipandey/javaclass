package kmypackage;

import java.util.Scanner;

public class DivisibilityBy15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
String stringvalue = sc.next();
String firstfournumber =stringvalue.substring(0,5);
int lasttwovalue=Divisibility.getNumber(stringvalue.substring(stringvalue.length()-2));

int firstnum =Divisibility.getNumber(stringvalue.substring(0,1));

int secondnum =Divisibility.getNumber(stringvalue.substring(1,2));
int thirdtnum =Divisibility.getNumber(stringvalue.substring(2,3));

int fourthnum =Divisibility.getNumber(stringvalue.substring(3,4));
int fivthnum =Divisibility.getNumber(stringvalue.substring(4,5));
int sum =firstnum+secondnum+thirdtnum+fourthnum+fivthnum;
System.out.println(sum);
if(sum%3==0 && lasttwovalue%5==0) {
	System.out.println("divisible by 15");
}else {
	System.out.println("not divisible by 15");
}

sc.close();

	}

}


