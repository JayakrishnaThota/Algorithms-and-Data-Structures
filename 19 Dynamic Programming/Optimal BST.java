package DynamicProgramming;

public class Optimal_BST {

    //O(n3) time and O(n2) space 
    public static int optimalSearchTree(int[] arr){
        if(arr==null || arr.length==0) return 0;
        int n = arr.length;
        int[][] cost = new int[n+1][n+1];
        for(int i=0;i<n;i++){
            cost[i][i] = arr[i];
        }
        for(int L=2;L<=n;L++){
            for(int i=0;i<=n-L+1;i++){
                int j = i+L-1;
                cost[i][j] = Integer.MAX_VALUE;
                for(int r=i;r<=j;r++){
                    cost[i][j] = Math.min(cost[i][j], sum(arr,i,j)+((i<=r-1)?cost[i][r-1]:0) +((r+1<=j?cost[r+1][j]:0)));
                }
            }
        }
        return cost[0][n-1];
    }

    public static int sum(int freq[], int i, int j) {
        int s = 0;
        for (int k = i; k <= j; k++) {
            if (k >= freq.length)
                continue;
            s += freq[k];
        }
        return s;
    }

    public static void main(String[] args) {
        int freq[] = {34, 8, 50};
        System.out.println("Cost of Optimal BST is " +
                optimalSearchTree(freq));
    }
}
