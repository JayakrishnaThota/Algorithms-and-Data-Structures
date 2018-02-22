package SearchingAlgorithms;

import java.util.*;

public class FirstRepeat {

    //O(n2) and O(1)
    public int firstRepeat(int[] nums){
        if(nums==null || nums.length==0) return -1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i]==nums[j]) return nums[i];
            }
        }
        return -1;
    }

    //O(n) and O(n)
    public int firstRepeat2(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums) map.put(n, map.getOrDefault(n,0)+1);
        for(int n:nums) if(map.get(n)>1) return n;
        return -1;
    }

    public static void main(String[] args) {
        FirstRepeat f = new FirstRepeat();
        Scanner in = new Scanner(System.in);
        System.out.println("Length of the array ");
        int n = in.nextInt();
        System.out.println("Contents of the array ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = in.nextInt();
        System.out.println(f.firstRepeat(nums));
        System.out.println(f.firstRepeat2(nums));
    }
}
