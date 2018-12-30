/*
 * board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
 */
public class WordSearch {
	    public boolean exist(char[][] board, String word) {
	        boolean exist = false;
	        for(int i = 0; i<board.length; i++){
	            for (int j =0; j<board[0].length ; j++){
	                if(board[i][j]!= word.charAt(0))
	                    continue;
	                 if(dfs(board,i,j,word,0))
	                     return true;
	            }
	        }
	        return exist;
	    }
	    public boolean dfs(char[][] board, int i , int j, String word, int off){
	        if(i<0 || j<0 || i>=board.length || j>= board[0].length )
	            return false;
	        char c = board[i][j];
	        if(c=='#'){
	            return false;
	        }
	        if(c!=word.charAt(off))
	            return false;
	        if(off == word.length() -1)
	            return true;
	        board[i][j]= '#';
	        boolean res = dfs(board,i-1,j,word,off+1) || dfs(board,i,j-1,word,off+1) ||
	            dfs(board,i+1,j,word,off+1) || dfs(board,i,j+1,word,off+1);
	        board[i][j] =c;
	    return res;
	    }
	public static void main(String[] args) {
		char[][] board =
			{
				  {'A','B','C','E'},
				  {'S','F','C','S'},
				  {'A','D','E','E'}};
		String word = "ABFCS";
		WordSearch w = new WordSearch();
		System.out.println("Word "+ word +" exists in board " + w.exist(board, word));

	}

}
