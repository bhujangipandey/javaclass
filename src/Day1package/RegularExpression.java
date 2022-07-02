package Day1package;

import java.util.Scanner;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string name");
         String stringvalue =sc.next();
         if(stringvalue.matches("^[A-Za-z]+$")) {
        	 System.out.println("yes it matches");
         }else {
        	 System.out.println("no it didn't matches");
	}
        
	
	//only number
	
	 System.out.println("Enter the secondstrinvalue");
	 String secondstringvalue = sc.next();
     if(secondstringvalue.matches("^[0-9]+$")) {
    	 System.out.println("yes it matches");
     }else {
    	 System.out.println("no it didn't matches");
     }
	
     //number with @
	
     System.out.println("Enter the secondstringvalue");
     String stringsecondvalue =sc.next();
     if(secondstringvalue.matches("^[0-9]+@$")){
    	 System.out.println("yes it mathes");
     }else {
    	 System.out.println("no  it didn't matches");
     }
     
	}}
     
     
     
     
     
     
     
     
     
     
     
     
          