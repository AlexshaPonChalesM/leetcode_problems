class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        Set<Integer> s=new HashSet<>();
        int arr[]=new int[2];
        int min=0,sum=0,count=0;
        for(int i=1;i<=n;i++)
        {
            count+=i;
        }
        for(int i=0;i<n;i++)
        {
            s.add(nums[i]);
            sum+=nums[i];
            if(s.size()==min)
            {
                arr[0]=nums[i];
                sum-=nums[i];
            }
            min=s.size();
        }
        arr[1]=count-sum;
        return arr;
    }
}