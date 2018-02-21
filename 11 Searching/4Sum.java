public class Solution {
    public List<List<Integer>> fourSum(int[] x, int target) {
         List<List<Integer>> res = new LinkedList<>();
       Arrays.sort(x);
        for(int h=0;h<x.length-3;h++)
       {
               if (h > 0 && x[h] == x[h - 1])             
               continue;
       for(int i=h+1;i<x.length-2;i++)
       {
               if (i > h+1 && x[i] == x[i - 1])             
               continue;
               int low = i+1, high = x.length-1;
               while(low<high)
               {
                int sum=x[i]+x[h]+x[low]+x[high];
               if(target==sum)
               {
                   res.add(Arrays.asList(x[h],x[i],x[low],x[high]));
                   low++;
                   high--;
                while (low < high && x[low] == x[low - 1]) low++;  
                while (low < high && x[high] == x[high + 1]) high--;
               }
               else if (sum < target)
                low++;
               else 
                high--;
            }
       }
           }
       return res;
    }
}

//Time Complexity : O(n3), SC:O(1)
