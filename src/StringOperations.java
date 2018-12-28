/*
 * This class is a collection of basic operations on string which can be done
 * 
 */
public class StringOperations {

	public static void main(String[] args) {
		String s = "This world is beautiful";
		swapFirstAndLastChar(s);
		expandString("1-5, 8, 11-14, 18, 20, 26-29");
	}
	public static void swapFirstAndLastChar(String s) {
		int j= 0;
		char c[] = s.toCharArray();
		for(int i =0; i<c.length; i++) {
			if(s.charAt(i) == ' ') {
				swapChars(i-1,j,c);
				j = i+1;
			}
		}
		swapChars(c.length-1,j,c);
		System.out.println("After Swaping first and last character string is "+String.valueOf(c));
	}
	public static void swapChars(int i , int j ,char[] s) {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
	/*
	 * Input : string x = "1-5, 8, 11-14, 18, 20, 26-29" 
	   Output : string y = "1, 2, 3, 4, 5, 8, 11, 12, 13, 14, 18, 20, 26, 27, 28, 29"
	 * 
	 */
	public static void expandString(String s) {
		String[] arr = s.split("-");
		for(int i = 0 ;i<arr.length ; i++) {
			System.out.println("Index : "+i +" value "+arr[i]);
		}
	}

}
