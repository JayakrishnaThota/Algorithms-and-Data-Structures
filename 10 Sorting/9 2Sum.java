public class Solution
{
  public boolean isSum(int[] a, int k)
  {
     Arrays.sort(a);
     int n = a.length;
     int low = 0, high = n-1;
     while(low<high){
      int sum = a[low] + a[high];
      if(sum==k) return true;
      else if(sum<k) low++;
      else high--;
     }
     return false;
   }
}
