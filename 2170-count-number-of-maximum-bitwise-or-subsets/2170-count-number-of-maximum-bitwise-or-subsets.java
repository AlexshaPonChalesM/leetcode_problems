class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int val=0;
        for(int i=0;i<nums.length;i++)
        val|=nums[i];
        List<List<Integer>> vals=new ArrayList<>();
        sub(vals,nums,new ArrayList<>(),0);
        int len=vals.size();
        int count=0;
        for(int i=0;i<len;i++)
        {
            int l=vals.get(i).size();
            int sum=0;
            //System.out.println(vals.get(i));
            for(int j=0;j<l;j++)
            {
                sum|=vals.get(i).get(j);
            }
            if(sum==val)count++;
        }
        return count;
    }
    public void sub(List<List<Integer>> vals,int nums[],List<Integer> temp,int i)
    {
        vals.add(new ArrayList<>(temp));
        for(int j=i;j<nums.length;j++)
        {
            temp.add(nums[j]);
            sub(vals,nums,temp,j+1);
            temp.remove(temp.size()-1);
        }
    }
}