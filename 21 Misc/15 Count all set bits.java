public class Solution{
public int hammingWeight(int n) {
        int count = 0;
        for(int i=0;i<32;i++){
            if((n&1)==1)
                count++;
            n>>>=1;
        }
        return count;
    }
 public int helper(int n)
 {
  int result = 0;
  for(int i=0;i<=n;i++){
  result += hammingWeight(i);
 }
 return result;
 }
 }
