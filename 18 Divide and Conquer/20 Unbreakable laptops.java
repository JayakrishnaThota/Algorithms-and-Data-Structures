//O(logn) time and O(1) space
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while(low<high){
            int mid = low + (high-low)/2;
            if((mid==0 && isBadVersion(mid))||(isBadVersion(mid)&&!isBadVersion(mid-1)))
                return mid;
            else if(isBadVersion(mid))
                high = mid;
            else
                low = mid+1;
        }
        return high;
    }
}
