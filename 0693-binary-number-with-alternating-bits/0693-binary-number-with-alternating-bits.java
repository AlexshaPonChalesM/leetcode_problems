class Solution {
    public boolean hasAlternatingBits(int n) {
        int i=-1;
        while(n>0)
        {
           int rem=n%2;
           if(i==rem)
           return false;
           i=rem;
           n/=2;
        }
        return true;
    }
}