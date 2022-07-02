package kmypackage;

import java.util.Scanner;

public class DivisivilityBy7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		String stringvalue =sc.next();
		String firstfivenumber =stringvalue.substring(0,5);
		String lastvalue = firstfivenumber.substring( Divisibility.getLength(firstfivenumber)-1);
		int multiplybytwo = Divisibility.getNumber(lastvalue)*2;
		int restnumber =Divisibility.getNumber(stringvalue.substring(0,4));
		int minusvalue = restnumber - multiplybytwo;
		System.out.println(minusvalue);
		
		
		String stringminusvalue = minusvalue +"";
		
		String stringminusevaluelastvalue = stringminusvalue.substring( Divisibility.getLength(stringminusvalue)-1);
		int minusvaluemultiplybytwo = Divisibility.getNumber(stringminusevaluelastvalue)*2;
		int minusvaluerestnumber =Divisibility.getNumber(stringminusvalue.substring(0,3));
		int secondminusvalue = minusvaluerestnumber - minusvaluemultiplybytwo;
		System.out.println(secondminusvalue);
		if(secondminusvalue%7==0) {
			System.out.println("Divisible by seven");
		}else {System.out.println("Not Divisible by seven ");
		
		}
	}

}
