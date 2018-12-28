import java.util.HashMap;

public class IsomorphicStrings {
	/**
	 * 
	 * Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.

		For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
	 */

	public static void main(String[] args) {
		String input1 = "foo";
		String input2 = "eee";
		System.out.println("These two strings are "+isIsometric(input1,input2));

	}
	public static boolean isIsometric (String input1, String input2) {
		if (input1 == null || null ==input2) {
			return false;
		}
		if(input1.length() != input2.length()) {
			return false;
		}
		
		//using input1 as the key to the map
		HashMap <Character, Character> mapChars = new HashMap<Character, Character>();
		for(int i = 0; i <input1.length() ; i++) {
			if(mapChars.containsKey(input1.charAt(i))){
				char mappedValue = mapChars.get(input1.charAt(i));
				if(mappedValue != input2.charAt(i))
					return false;
			}
			else {
				if(mapChars.containsValue(input2.charAt(i)))
					return false;
				mapChars.put(input1.charAt(i), input2.charAt(i));
			}
		}
		return true;
	}

}
