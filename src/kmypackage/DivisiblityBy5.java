package kmypackage;

import java.util.Scanner;

public class DivisiblityBy5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value");
        String stringvalue = sc.next();
        String lastvalue= stringvalue.substring(getLength(stringvalue)-1);
       int intNumber=getNumber(lastvalue);
       System.out.println(intNumber);
       if((intNumber==0) ||(intNumber==5)) {
    	   System.out.println("divisible by 5");
       }else {
    	   System.out.println("not divisible by 5");
       }
       
        
        
	}

	public static int getNumber(String value) {
		
		return  Integer.parseInt(value);
	}

	public static int getLength(String value) {
		
		return value.length();
	}

}
