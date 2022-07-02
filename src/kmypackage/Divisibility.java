package kmypackage;
import java.util.Scanner;
public class Divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		String stringvalue = sc.next();
		String lastvalue =stringvalue.substring(getLength(stringvalue)-2);
		int intNumber = getNumber(lastvalue);
		if(intNumber%2==0) {
			System.out.println("Divisival by two");
		}else {
			System.out.println("Not Divisival by Two");
		}
		
		System.out.println(intNumber);		
		sc.close();	}	
		public static int getNumber(String value) {
			return Integer.parseInt(value);
		}
	public static int getLength(String value)
	{return value.length();

	}

}
