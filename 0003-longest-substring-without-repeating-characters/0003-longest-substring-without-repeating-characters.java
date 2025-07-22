class Solution {
    public int lengthOfLongestSubstring(String s) {
        int fre[]=new int[1000];
        int len=s.length();
        int j=0,max=0,count=0;
        for(int i=0;i<len;i++)
        {
            if(fre[s.charAt(i)-' ']!=0)
            {
                max=Math.max(max,count);
                for(int k=j;k<i;k++)
                {
                    count--;
                    fre[s.charAt(k)-' ']--;
                    if(s.charAt(i)==s.charAt(k))
                    {
                        j=k+1;
                        break;
                    }
                }
            }
            fre[s.charAt(i)-' ']++;
            count++;
        }
        max=Math.max(count,max);
        return max;
    }
}