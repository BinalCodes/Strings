import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class WordNode{
	String word;
	int numSteps;
	WordNode (String word , int numOfSteps){
		this.word = word;
		this.numSteps = numOfSteps;
	}
}

public class WordLadder {
	/**
	 * Given two words (start and end), and a dictionary, 
	 * find the length of shortest transformation sequence from start to end, such that only one letter 
	 * can be changed at a time and each intermediate word must exist in the dictionary. For example, given
		start = "hit"
		end = "cog"
		dict = ["hot","dot","dog","lot","log"]
	
	 */

	public static void main(String[] args) {
		String startWord = "hit";
		String endWord = "cog";
		HashSet<String> dict = new HashSet<String>(Arrays.asList("hot","dot","dog","lot","log"));
		System.out.println("Number of steps to transform is " +workTheLadder(startWord,endWord,dict));
	}
	public static int workTheLadder (String start, String end, Set<String> dict) {
		if (null == start || null == end) {
			return -1;
		}
		if(start.length()!= end.length())
			return -1;
		LinkedList<WordNode> wordQ = new LinkedList<WordNode>();
		wordQ.add(new WordNode(start,1));
		dict.add(end);
		if(start.equalsIgnoreCase(end))
			return 0;
		while(!wordQ.isEmpty()) {
			WordNode top = wordQ.remove();
			String wordToTransform = top.word;
			if (wordToTransform.equals(end))
				return top.numSteps;
			char[] wordArr = wordToTransform.toCharArray();
			for ( int i =0 ;i <wordArr.length ; i++) {
				for(char c ='a'; c<='z' ; c++) {
					char temp = wordArr[i];
					if(temp!= c) {
						wordArr[i] = c;
					}
					String newWord = String.valueOf(wordArr);
					if(dict.contains(newWord)) {
						wordQ.add(new WordNode(newWord,top.numSteps+1));
						dict.remove(newWord);
					}
					wordArr[i] = temp;
				}
			}
			
		}
		return 0;
	}
}
