class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int len=arr.length;
        for(int i=0;i<len-2;i++)
        {
            int count=0;
            for(int j=i;j<i+3;j++)
            {
                if(arr[j]%2==0)break;
                count++;
            }
            if(count==3)return true;
        }
        return false;
    }
}