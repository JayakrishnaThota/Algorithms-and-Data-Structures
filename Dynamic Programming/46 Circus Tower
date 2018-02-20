//O(n2) time and space
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        //Sanity check
        if(envelopes==null || envelopes.length==0) return 0;
        int m = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                if(o1[0]!=o2[0])
                    return o1[0]-o2[0];
                else 
                    return o2[1]-o1[1];
            }
        });
        int[] dp = new int[m];
        int res = 0;
        for(int i=0;i<m;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if((envelopes[i][0]>envelopes[j][0])&&(envelopes[i][1]>envelopes[j][1]))
                    dp[i] = Math.max(dp[i],1+dp[j]);
            }
            res = Math.max(dp[i],res);
        }
        return res;
    }
}
