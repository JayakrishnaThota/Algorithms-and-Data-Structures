
public class knapSack {
public static int knapsack(int[] v, int[] w, int C){
	int[][] K = new int[v.length+1][C+1];
	for(int i=0;i<=v.length;i++){
		for(int j=0;j<=C;j++){
			if(i==0||j==0){
				K[i][j] = 0;
				continue;
			}
			if(j-w[i-1]>=0){
				K[i][j] = Math.max(K[i-1][j], K[i-1][j-w[i-1]]+v[i-1]);
			}
			else{
				K[i][j] = K[i-1][j];
			}
		}
	}
	return K[v.length][C];
}
public static void main(String[] args){
	int[] v = {60,100,120};
	int[] w = {10,20,30};
	int C = 50;
	System.out.println(knapsack(v,w,C));
}
}
