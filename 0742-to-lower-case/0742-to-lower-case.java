class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        char ans[]=new char[n];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                int a=(int)s.charAt(i)-'A';
                ans[i]=(char)('a'+a);
            }
            else
            ans[i]=s.charAt(i);
        }
        return new String(ans);
    }
}