import java.util.ArrayList;

public class PermutationsString {

	public static void main(String[] args) {
		
		System.out.println("Permutuations are "+getPermutations("bina"));
	}

	public static ArrayList<String> getPermutations (String str){
		if (str == null)
			return null;
		ArrayList<String> permutations = new ArrayList<String>();
		if (str.length() == 0) {
			permutations.add("");
			System.out.println("Empty perms added for string "+str);
			return permutations;
		}
		char first = str.charAt(0);
		String remaining = str.substring(1);
		ArrayList<String> words = getPermutations(remaining);
		for (String word : words) {
			System.out.println("calculating perm for word "+word +" with first as "+first);
			for (int j =0;j<=word.length();j++) {
				String s = insertCharAt(word,first,j);
				permutations.add(s);
			}
		}
		return permutations;
	}
	public static String insertCharAt(String word, char c , int pos) {
		String start = word.substring(0, pos);
		String end = word.substring(pos);
		return start + c + end;
	}
}
