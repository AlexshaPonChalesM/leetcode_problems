class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int u=0,l=0;
        for(int i=0;i<n;i++)
        {
            if(word.charAt(i)>='a'&&word.charAt(i)<='z')
            l++;
            else
            u++;
        }
        if(l==n)
        {
            return true;
        }
        else if(u==n)
        {
        return true;
        }
        else if(u==1)
        { 
            if(word.charAt(0)>='A' && word.charAt(0)<='Z')
            return true;
            else return false;
        }
        return false;
    }
}