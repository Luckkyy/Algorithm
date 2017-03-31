
public class Node {
	Node parent;
	Node children;
	int[][] board = new int[4][4];
	int[][] color = new int[4][4];
	int heuristic;
	boolean expand;
	boolean max;
	int level;
	
	public Node(){
		parent = null;
		children = null;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				board[i][j]=0;
				color[i][j]=-1;
			}
		}
		heuristic = -1;
		expand = false;
		max = true;
		level = 0;
	}
	
}
