
public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println("palindrome string is "+longestPalindrome("abacd"));

	}
	public static String longestPalindrome(String s) {
        String result = "";
        for(int i =0;i< s.length(); i++){
            for( int j = 0 ; j < (s.length() - i ); j++){
                System.out.println("i and j "+ i +" "+ j );
            	String tmp = s.substring(i,s.length() - j);
                if(tmp.equals(reverseString(tmp)) && tmp.length() > result.length()){
                    result = tmp;
                }
            }
        }
        return result;
    }
    public  static String reverseString(String str){
    return new StringBuilder(str).reverse().toString();
}

}
