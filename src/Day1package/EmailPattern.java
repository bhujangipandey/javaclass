package Day1package;

import java.util.Scanner;

public class EmailPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String stringvalue = sc.next();
		if (stringvalue.matches("^[A-Za-z0-9]+@gmail.com$")){
			
		System.out.println("it is match");
		
		}else {
			System.out.println("no it didn't  match");
		}
		sc.close();
	}
}
