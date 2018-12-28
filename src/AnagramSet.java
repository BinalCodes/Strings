/* Problem Name is &&& Group Anagrams &&& PLEASE DO NOT REMOVE THIS LINE. */

/**
 * Instructions to candidate.
 *  1) Given a list of words, group them by anagrams
 *     Input: List of "cat", "dog", "god"
 *     Output: A Set of Sets of anagrams: {{'cat'}, {'dog', 'god'}}
 *  2) Run this code in the REPL to observe its behaviour. The
 *     execution entry point is main().
 *  3) Consider adding some additional tests in doTestsPass().
 *  4) Implement the AnagramSolution group() method correctly.
 *  5) If time permits, try to improve your implementation.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
public class AnagramSet {

  /**
   * A means for grouping words by anagram (same letters irrespective of order)
   */
  @FunctionalInterface
  interface AnagramSolution {
    Set<Set<String>> group(List<String> words);
  }

  /**
   * public static boolean doTestsPass()
   * Returns true if all tests pass. Otherwise returns false
   */
  public static boolean doTestsPass(){
    // todo: implement more tests, please
    // feel free to make testing more elegant

    // given some words
    List<String> wordsList = Arrays.asList("cat", "dog", "god", "cat");

    // todo : and a solution to the problem
    AnagramSolution sol = (words) ->{
      Map<String,HashSet<String>> map = new HashMap<String,HashSet<String>>();
    //ArrayList<String> sortedList = new ArrayList<String>();
    for(String word : words){
      char[] wordArr = word.toCharArray();
      Arrays.sort(wordArr);
      String sortedStr = String.valueOf(wordArr);
      
      if(map.containsKey(sortedStr)){
        HashSet<String> w = map.get(sortedStr);
        w.add(word);
        map.put(sortedStr,w);
      }
      else{
         HashSet<String> w = new HashSet<String>();
         w.add(word);
         map.put(sortedStr , w);
      }
    }
    
    Set<Set<String>> groups = new HashSet();
    for(Map.Entry<String,HashSet<String>> entry : map.entrySet()){
        HashSet<String> group = entry.getValue();
      groups.add(group);
    }
    return groups;
      
    };
    
    
    // when grouped
    Set<Set<String>> grouped = sol.group(wordsList);

    // we expect god and dog to be identified as anagrams, whilst cat isn't
    boolean result = true;
    result = result && grouped.contains(new HashSet<>(Arrays.asList("cat")));
    result = result && grouped.contains(new HashSet<>(Arrays.asList("dog", "god")));
    return result;
  };



  /**
   * Execution entry point.
   */
  public static void main(String[] args){
    if(doTestsPass()){
      System.out.println("All tests pass");
    } else {
      System.out.println("There are test failures");
    }

  }
}

