import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/*
 * Given two strings find the smallest window containing string 2 in string 1
 * Input :  string = "this is a test string"
         pattern = "tist"
	Output :  Minimum window is "t stri"
Explanation: "t stri" contains all the characters
              of pattern.

Input :  string = "geeksforgeeks"
         pattern = "ork" 
Output :  Minimum window is "ksfor"
 */
public class SmallestWindow {

	public static void main(String[] args) {
		String input = "this is a test string";
		String pattern = "tist";
		smallestWindow(input,pattern);
		smallestWindowDistinctChar("aabcccdbhca");
	}
	/*
	 * Input  : aabcbcdbca
	   Output : dcba
	   Explanation : 
	   dbca of length 4 is the smallest 
	   window with highest number of distinct
	   characters.
	 */
	public static void smallestWindowDistinctChar(String s) {
		int len1 = s.length();
		int dist_char = 0;
		boolean[] visited = new boolean[256];
		for(int i =0 ; i<len1; i++) {
			if(visited[s.charAt(i)] == false) {
				visited[s.charAt(i)] = true;
				dist_char++;
			}
		}
		int count = 0, min_length = Integer.MAX_VALUE, start =0 , start_index = -1;
		int[] hash_str = new int[256];
		for(int i = 0 ; i<len1 ; i++) {
			hash_str[s.charAt(i)]++;
			if(hash_str[s.charAt(i)] == 1)
				count++;
			if(count ==dist_char) {
				while(hash_str[s.charAt(start)] >1) {
					if(hash_str[s.charAt(start)] >1)
						hash_str[s.charAt(start)] --;
					start++;
				}
				int windowLenght = i - start +1;
				if(min_length> windowLenght) {
					min_length = windowLenght;
					start_index = start;
				}
			}
		}
		if(start_index  == -1) {
			//no window found
			System.out.println("No matching window found");
		}
		System.out.println( s.substring(start_index, start_index+min_length));
	}
	public static void smallestWindow(String s, String pattern) {
		int len1 = s.length();
		int len2 = pattern.length();
		if(len2> len1) {
			System.out.println("No such string exists as length of pattern is more than string");
		}
		int hash_patt[] = new int[256];
		int hash_str[] = new int[256];
		for(int i = 0 ;i < len2 ; i++) {
			hash_patt[pattern.charAt(i)]++;
		}
		int count =0 , start = 0 , start_index = -1, min_length = Integer.MAX_VALUE;
		for(int i = 0 ; i<len1 ; i++) {
			hash_str[s.charAt(i)]++;
			
			if(hash_patt[s.charAt(i)]!=0 && hash_str[s.charAt(i)] <= hash_patt[s.charAt(i)]) {
				count++;
			}
			if(count ==len2) {
				while(hash_patt[s.charAt(start)] < hash_str[s.charAt(start)] || hash_patt[s.charAt(start)] ==0 ) {
					if(hash_patt[s.charAt(start)] < hash_str[s.charAt(start)])
						hash_str[s.charAt(start)] --;
					start++;
				}
				int windowLength = i - start +1;
				if(min_length > windowLength) {
					min_length = windowLength;
					start_index = start;
				}
				
			}
		}
		if(start_index  == -1) {
			//no window found
			System.out.println("No matching window found");
		}
		System.out.println( s.substring(start_index, start_index+min_length));
	}
}
