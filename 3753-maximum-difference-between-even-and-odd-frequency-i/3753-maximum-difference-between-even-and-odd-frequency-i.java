class Solution {
    public int maxDifference(String s) {
        int fre[]=new int[26];
        int n=s.length(),max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            fre[s.charAt(i)-'a']++;
        }
        TreeSet<Integer> s1=new TreeSet<>();
        TreeSet<Integer> s2=new TreeSet<>();
        for(int i=0;i<26;i++)
        {
            if(fre[i]!=0 && fre[i]%2==0)
            {
                s1.add(fre[i]);
            }
            else if(fre[i]!=0 && fre[i]%2==1)
            {
                s2.add(fre[i]);
            }
        }
        for(int len : s2)
        {
            for(int m:s1)
            {
                int sum=len-m;
                if(sum>max)max=sum;
            }
        }
        return max;
    }
}