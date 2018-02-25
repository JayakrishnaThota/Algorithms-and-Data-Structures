//O(n) time and O(1) space solution
class Solution {
    public void sortColors(int[] nums) {
        int a=0,b=0,c=0;
        for(int num:nums){
            if(num==0) a++;
            else if(num==1) b++;
            else c++;
        }
        int index = 0;
        while(index<a){
            nums[index++] = 0;
        }
        while(index<a+b){
            nums[index++] = 1;
        }
        while(index<a+b+c){
            nums[index++] = 2;
        }
    }
}
