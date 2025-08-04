class Solution {
    public int totalFruit(int[] fruits) {
        int max=Integer.MIN_VALUE;
        int n=fruits.length,index=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(fruits[i]);
            if(set.size()>2)
            {
                set.clear();
                int val=i-1;
                int store=fruits[val];
                while(val>0 && store==fruits[val-1])
                {
                    val--;
                }
                index=val;
                set.add(store);
                set.add(fruits[i]);
            }
            max=Math.max(max,i-index+1);
        }
        return max;
    }
}