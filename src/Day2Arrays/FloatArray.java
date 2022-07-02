package Day2Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		Float[] floatArray = new Float[4];
		floatArray[0] = sc.nextFloat();
		floatArray[1] = sc.nextFloat();
		floatArray[2] = sc.nextFloat();
		floatArray[3] = sc.nextFloat();
		System.out.println(Arrays.toString(floatArray));
	}

}
