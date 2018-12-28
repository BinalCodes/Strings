/*
 * Remove 3 or more consecutive characters in a string and repeat if necessary
 * 
 * ABCCCCBBA => ABBBA =>AA
 */
public class RemoveRepeatingChar {

	public static void main(String[] args) {
		String str = "ABCCCCBBA";
		System.out.println("Unique string is "+getUniqueStr(str));
		
		
	}
	public static String getUniqueStr (String str) {
		for (int i = 0; i < str.length() ; i++) {
			int j = i;
			while( j < str.length() && str.charAt(i) == str.charAt(j)) {
				j++;
			}
			if ( j -i >= 3) {
				str = str.substring(0, i) + str.substring(j);
				System.out.println("String formed is "+str);
				i = 0;
			}
		}
		return str;
	}

}
