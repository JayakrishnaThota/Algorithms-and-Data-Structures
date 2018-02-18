package DynamicProgramming;
import java.util.*;

public class MaxLenPairChain {
    private int MaxLenPairChain(int[][] pairs){
            Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
            int sum = 0, n = pairs.length, i = -1;
            while (++i < n) {
                sum++;
                int curEnd = pairs[i][1];
                while (i+1 < n && pairs[i+1][0] <= curEnd) i++;
            }
            return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MaxLenPairChain m = new MaxLenPairChain();
        System.out.println("Please enter the array length");
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        System.out.println("Please enter the contents of the array ");
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++)
                arr[i][j] = in.nextInt();
        }
        System.out.println("Maximum length of pair chain is "+m.MaxLenPairChain(arr));
    }
}
