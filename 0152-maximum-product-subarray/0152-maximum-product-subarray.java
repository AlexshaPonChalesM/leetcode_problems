class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int mul=1;
            for(int j=i;j<n;j++)
            {
                mul*=nums[j];
                max=max<mul?mul:max;
            }
        }
        return max;
    }
}