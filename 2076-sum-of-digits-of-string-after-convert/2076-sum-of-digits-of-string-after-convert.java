class Solution {
    public int getLucky(String s, int k) {
        String ans="";
        int n=s.length();
        for(int i=0;i<n;i++)
        ans+=((s.charAt(i)-'a')+1);
        int sum=0;
        while(k-- >0)
        {
            int len=ans.length();
            sum=0;
            for(int i=0;i<len;i++)
            sum+=ans.charAt(i)-'0';
            ans=String.valueOf(sum);
        }
        return sum;
    }
}