
public class CongaPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start = new Node();
		Node currentState = new Node();
		boolean move = false;
		int node_account = 0;
		start.board[0][0] = 10;
		start.board[3][3] = 10;
		start.expand = true;
		start.max = true;
		start.color[0][0]=0; //0 indicate black
		start.color[3][3]=1;//1 indicate white
		currentState = start;
		//move = true;
		System.out.println("Game begin");
		printGrid(start.board);
		printGrid(start.color);
		move = goal(currentState,0);
		System.out.println(move);
		//while(move){
			//doing max
			//goal judge on 1(while stone)
		//	if(move){
				//doing min
				//goal judege on 0(black stone)
		//	}
		//}
	}
	
	public static boolean goal(Node state,int color){
		int[][] temp_color = state.color;
		for(int i = 0; i <temp_color.length;i++){
			for(int j = 0; j < temp_color[i].length; j++){
				if(temp_color[i][j]==color){
					if(adjacent(temp_color,j,i,color))
						return true;
				}
			}
		}
		return false;
	}
	
	public static boolean adjacent(int[][] dis,int x, int y, int color){
		if(!(x-1<0)&&!(y-1<0)){
			if(dis[x-1][y-1]==color||dis[x-1][y-1]==-1)
				return true;
		}
		if(!(x-1<0)){
			if(dis[x-1][y]==color||dis[x-1][y]==-1)
				return true;
		}
		if(!(x-1<0)&&!(y+1>3)){
			if(dis[x-1][y+1]==color||dis[x-1][y+1]==-1)
				return true;
		}
		if(!(y-1<0)){
			if(dis[x][y-1]==color||dis[x][y-1]==-1)
				return true;
		}
		if(!(y+1>3)){
			if(dis[x][y+1]==color||dis[x][y+1]==-1)
				return true;
		}
		if(!(x+1>3)&&!(y-1<0)){
			if(dis[x+1][y-1]==color||dis[x+1][y-1]==-1)
				return true;
		}
		if(!(x+1>3)){
			if(dis[x+1][y]==color||dis[x+1][y]==-1)
				return true;
		}
		if(!(x+1>3)&&!(y+1>3)){
			if(dis[x+1][y+1]==color||dis[x+1][y+1]==-1)
				return true;
		}
		return false;
	}
	
	public static Node max(Node state){
		return null;
	}
	
	public static Node min(Node state){
		return null;
	}
	
	
	public static void printGrid(int[][] a)
	{
	   for(int i = 0; i < a.length; i++)
	   {
	      for(int j = 0; j < a[i].length; j++)
	      {
	         System.out.printf("%5d ", a[i][j]);
	      }
	      System.out.println();
	   }
	   System.out.println("\n");
	}

}
