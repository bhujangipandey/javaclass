package Day1package;

import java.util.Scanner;

public class DatPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String stringvalue = sc.next();
		if(stringvalue.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-((000[1-9])|([0-9]{4}))$")){
			System.out.println("it is date value");
		}else {
			System.out.println("no it not date value");
			}
	
sc.close();
	}

}
