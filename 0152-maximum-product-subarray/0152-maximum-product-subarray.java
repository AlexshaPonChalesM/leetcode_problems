class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int mul=1;
        for(int i=0;i<n;i++)
        {
            mul*=nums[i];
            if(mul>max)max=mul;
            if(nums[i]==0)mul=1;
        }
        mul=1;
        for(int i=n-1;i>=0;i--)
        {
            mul*=nums[i];
            if(mul>max)max=mul;
            if(nums[i]==0)mul=1;
        }
        return max;
    }
}