package week2c.day2assign;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum=0;
		for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
            int numvalue=Character.getNumericValue(text.charAt(i));
            sum=sum+numvalue;
            }
        }
		System.out.println("Sum of digits in a string is " + sum);

	}

}
