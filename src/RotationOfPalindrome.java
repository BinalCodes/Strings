/*
 * Given a string, check if it is a rotation of a palindrome. 
 * For example your function should return true for “aab” as it is a rotation of “aba”.
 */

public class RotationOfPalindrome {

	public static void main(String[] args) {
		//to check for rotation of a palindrome we take input string and concatenate it with itself
		String s = "abcab"; //aab returns true
		System.out.println("Can be rotated to form palindrome "+canBeRotated(s));
	}
	
	public static boolean canBeRotated(String s) {
		for(int i =0 ;i <s.length()-1 ; i++) {
			String str1 = s.substring(i+1);
			String str2 = s.substring(0, i+1);
			
			if(Palindrome.isPalindrome(str1+str2)) {
				return true;
			}
		}
		return false;
	}
}
