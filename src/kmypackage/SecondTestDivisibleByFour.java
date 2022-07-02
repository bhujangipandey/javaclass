package kmypackage;

public class SecondTestDivisibleByFour {

	public static void main(String[] args) {


	}

	private static boolean checkDatePattern(String date) {
		if(date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-([0-9]{4}$")) {
			return true;
		}else {
			return false;
		}
		
	}

	public static int getDate(String date) {
		String[] dateArray=date.split("-");
		return Integer.parseInt(dateArray[dateArray.length-3]);
		
		
	}

	public static int getMonth(String date) {
		String[] dateArray=date.split("-");
		return Integer.parseInt(dateArray[dateArray.length-2]);
		
	}

	public static int getYear(String Year) {
		String[] dateArray=Year.split("-");
		return Integer.parseInt(dateArray[dateArray.length-1]);
	}

	public static boolean checkDivisiblityByFour(String year) {
		String lastTwoValue=year.substring(2,4);
		int intNumber=Integer.parseInt(lastTwoValue);
		if(intNumber%4==0) {
			return true;
		}else {
			return false;
		}
		
	}

}
