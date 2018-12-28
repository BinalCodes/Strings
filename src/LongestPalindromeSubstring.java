/*
 * Given a string, find the longest substring which is palindrome. For example, 
 * if the given string is “forgeeksskeegfor”, the output should be “geeksskeeg”.
 * 
 */
public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		/*
		 * Step to generate odd length palindrome:
		   Fix a centre and expand in both directions for longer palindromes.

			Step to generate even length palindrome
			Fix two centre ( low and high ) and expand in both directions for longer palindromes
		 */
		String s = "aaadaa";
		longestPalSubstr(s);
	}
	public static int longestPalSubstr(String s) {
		int maxLength = 1;
		int start = 0;
		int low =0, high = 0;
		for(int i = 1 ;i <s.length(); i++) {
			
			//check for even cases
			low = i-1;
			high = i;
			while(low >=0 && high< s.length() && s.charAt(low) == s.charAt(high) ) {
				if(high -low +1 > maxLength) {
					start = low;
					maxLength = high-low +1;
				}
				--low;
				++high;
			}
			//check for odd cases
			low = i-1;
			high = i+1;
			while(low >=0 && high< s.length() && s.charAt(low) == s.charAt(high) ) {
				if(high -low +1 > maxLength) {
					start = low;
					maxLength = high-low +1;
				}
				--low;
				++high;
			}
		}
		printPalindromeStr(start,maxLength,s);
		return maxLength;
	}
	
	public static void printPalindromeStr(int start, int length, String s) {
		System.out.println(s.substring(start, start+length));
	}

}
