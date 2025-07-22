class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max=0,sum=0;
        int fre[]=new int[10001];
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(fre[nums[i]]==0)
            {
                sum+=nums[i];
                fre[nums[i]]++;
            }
            else
            {
                max=Math.max(sum,max);
                for(int k=j;k<i;k++)
                {
                    sum-=nums[k];
                    fre[nums[k]]--;
                    if(nums[k]==nums[i])
                    {
                        j=k+1;
                        break;
                    }
                }
                sum+=nums[i];
                fre[nums[i]]++;
            }
        }
        max=Math.max(max,sum);
        return max;
    }
}