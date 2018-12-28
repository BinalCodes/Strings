import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbin";
		StringTest sObj = new StringTest();
		System.out.println(sObj.getSortedString(s));
	}
	public String getSortedString(String str){
        char[] a = str.toCharArray();
		Arrays.sort(a);
        return String.valueOf(a);
    }

}
