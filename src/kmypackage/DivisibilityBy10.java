package kmypackage;

import java.util.Scanner;

public class DivisibilityBy10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		String stringvalue= sc.next();
		int lastvalue = Integer.parseInt(stringvalue.substring(stringvalue.length()-1));
	    System.out.println(lastvalue);
	    
	    if(lastvalue==0) {
	    	System.out.println("Divisible By Ten");
	    }else {
	    	System.out.println("Not Divisible by Ten");
	    }
	  sc.close();  
	}

}
