/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=0;
        int high=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isBadVersion(mid))
            {
                if(isBadVersion(mid-1))
                {
                    high=mid-1;
                }
                else
                {
                    return mid;
                }
            }
            else
            {
                if(isBadVersion(mid+1))
                return mid+1;
                else
                low=mid+1;
            }
        }
        return n;
    }
}