package kmypackage;

import java.util.Scanner;

public class DivisivilityBy8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		String stringvalue = sc.next();
		String lastvalue =stringvalue.substring(Divisibility.getLength(stringvalue)-3);
		int intNumber = Divisibility.getNumber(lastvalue);
		System.out.println(intNumber);
		if(intNumber%8==0) {
			System.out.println("Divisible By Eight");
		}else {System.out.println("Not Divisible By Eight");
		
		}
		sc.close();
		}

}
