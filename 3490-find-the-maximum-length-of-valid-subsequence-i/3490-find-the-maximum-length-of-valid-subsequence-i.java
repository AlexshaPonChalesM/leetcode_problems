class Solution {
    public int maximumLength(int[] nums) {
        int part[][]={{0,0},{0,1},{1,1},{1,0}};
        int max=0;
        for(int p[] : part)
        {
            int count=0;
            for(int num:nums)
            {
                if(num%2==p[count%2])
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}