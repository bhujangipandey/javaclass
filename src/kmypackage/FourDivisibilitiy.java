package kmypackage;

import java.util.Scanner;

public class FourDivisibilitiy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");//1234
		String stringvalue = sc.next();
		String firstfournumber =stringvalue.substring(0,4);
		int lasttwoValue = Integer.parseInt(stringvalue.substring(2,4));
		System.out.println(lasttwoValue);
		if((lasttwoValue%4 == 0)||(lasttwoValue==0)){
			System.out.println(" it is divisibile by 4");
		}else {
			System.out.println(" no it is not divisible by 4");
		}
	}

}
