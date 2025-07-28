class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int fre[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            fre[nums[i]]=1;
        }
        List<Integer> li=new ArrayList<>();
        for(int i=1;i<n+1;i++)
        {
            if(fre[i]==0)li.add(i);
        }
        return li;
    }
}