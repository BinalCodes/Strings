
public class Palindrome {

	public static void main(String[] args) {
		String s = "aba";
		System.out.println("Is palindrome "+isPalindrome(s));

	}
	public static boolean isPalindrome(String s) {
		int low = 0, high = s.length() -1;
		while(low< high) {
			if(s.charAt(low) != s.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

}
