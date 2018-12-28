import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class BasicStringTest {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("I am fond of ice-cream and chocolates and cakes");
		System.out.println("Printing this long string and expecting array index out of bounds "+s);
	   System.out.println("max profit "+maxProfit(new int[] {1,2,3,4,5}));
	   
	   LinkedList<Integer> queue = new LinkedList<Integer>();
	   queue.addAll(Arrays.asList(1,5,6,3,2,9));
	   System.out.println(queue.get(1));
	   
	}
	 public static int maxProfit(int[] prices) {
	        int maxprofit = 0;
	        for (int i = 1; i < prices.length; i++) {
	            if (prices[i] > prices[i - 1])
	                maxprofit += prices[i] - prices[i - 1];
	        }
	        return maxprofit;
	    }

}
