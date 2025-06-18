class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int flag=1;
            for(int j=0;j<n;j++)
            {
                if(baskets[j]!=0 && fruits[i]<=baskets[j])
                {
                    flag=0;
                    baskets[j]=0;
                    break;
                }
            }
            if(flag==1)
            count++;
        }
        return count;
    }
}