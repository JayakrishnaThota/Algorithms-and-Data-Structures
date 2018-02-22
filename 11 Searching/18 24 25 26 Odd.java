//O(n) and O(1)
public class Solution{
  public int odd(int[] nums){
    int x = 0;
    for(int n:nums) x^=n;
    return x;
  }
}
