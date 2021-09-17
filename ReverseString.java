package week2c.day2assign;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		char testchar[]=test.toCharArray();
		for(int i=testchar.length-1;i>=0;i--) {
			System.out.print(testchar[i]);
		}
		
		String substr=test.substring(8, 12);
		System.out.println( "   values from index 8 to 12  " + substr );

	

}
}
