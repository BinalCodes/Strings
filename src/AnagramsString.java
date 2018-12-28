import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class AnagramsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "listen";
		String str1 = "silent";
		System.out.println("Strings Anagram ? :"+isAnagram(str,str1));
		
	}
	public static boolean isAnagram(String str1, String str2) {
		// assuming the string is only lower case alphabets, if we want to take whole
		//character set then 256 is a better idea
		int[] cnt = new int[26];
		if(str1.length() != str2.length())
			return false;
		for(int i = 0; i<str1.length() ; i++) {
			cnt[str1.charAt(i)-'a'] ++;
			cnt[str2.charAt(i)-'a'] --;
		}
		for(int i =0 ; i< cnt.length ; i++) {
			if(cnt[i]!=0)
				return false;
		}
		
		return true;
	}

}
