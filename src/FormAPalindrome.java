/*
 * Check if characters of a given string can be rearranged to form a palindrome
Given a string, Check if characters of the given string can be rearranged to 
form a palindrome. 
For example characters of “geeksogeeks” can be rearranged 
to form a palindrome “geeksoskeeg”, 
but characters of “geeksforgeeks” cannot be rearranged to form a palindrome.
 * 
 */
public class FormAPalindrome {

	public static void main(String[] args) {
		// a palindrome has atmost one odd alphabet and all even alphabets.
		//to solve this we will count all alphabets and check for only one odd count
		String s = "geeksogeeks";
		System.out.println("Rearranged to be a palindrome "+canFormPalindrome(s));
	}
	public static boolean canFormPalindrome(String s) {
		int count[] = new int[256];
		int cnt =0;
		for(int i =0 ;i< s.length(); i++) {
			count[s.charAt(i)]++;
		}
		for(int i=0;i< count.length; i++) {
			if(count[i]%2!= 0)
				cnt++;
			if(cnt>1)
				return false;
		}
		return true;
	}
}
