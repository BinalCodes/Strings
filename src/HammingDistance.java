
public class HammingDistance {
	  
	// Function to calculate hamming distance 
	static int hammingDistance(int n1, int n2) 
	{ 
	    int x = n1 ^ n2; 
	    int setBits = 0; 
	  
	    while (x > 0)  
	    { 
	    	System.out.println("x "+x);
	        setBits += x & 1; 
	        System.out.println("setBits "+setBits +" with x "+x);
	        x >>= 1; 
	    } 
	  
	    return setBits; 
	} 
	  
	// Driver code 
	public static void main(String[] args)  
	{ 
	    int n1 = 2, n2 = 4; 
	    System.out.println(hammingDistance(n1, n2)); 
	} 
}
