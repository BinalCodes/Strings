import java.util.regex.Pattern;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString str = new ReverseString();
		String s = "the sky is blue";
		str.reverseWords(s.toCharArray());
		System.out.println("Reversed string alternate approach is "+str.reverseStrAlternateApproach(s));

	}
	public void reverseWords(char[] s) {
	    int i=0;
	    for(int j=0; j<s.length; j++){
	        if(s[j]==' '){
	        	//System.out.println("i :"+i +" j: "+j );
	            reverse(s, i, j-1);        
	            i=j+1;
	        }
	    }
	 
	    reverse(s, i, s.length-1);
	 
	    reverse(s, 0, s.length-1);
	    System.out.println("reversed string "+ String.valueOf(s));
	}
	 
	public void reverse(char[] s, int i, int j){
	    while(i<j){
	    	//System.out.println("Reverse call i :"+i +" j: "+j );
	    	//System.out.println("s[i] :"+s[i] +" s[j]: "+s[j] );
	        char temp = s[i];
	        s[i]=s[j];
	        s[j]=temp;
	        i++;
	        j--;
	        //System.out.println("String after each reverse call is "+ String.valueOf(s));
	    }
	}
	
	public String reverseStrAlternateApproach(String s) {
		Pattern p = Pattern.compile("\\s");
		String[] temp = p.split(s);
		String result = "";
		
		for(int i=0 ; i<temp.length; i++) {
			if(i == temp.length -1)
				result = temp[i] +result;
			else {
				result = " "+temp[i]+result;
			}
		}
		return result;
	}

}
