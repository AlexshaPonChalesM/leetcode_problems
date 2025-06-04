class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
        if(num==4)return true;
        if(num==9)return true;
        int n=num/4;
        for(int i=4;i<=n;i++)
        {
            if(i*i==num)return true;
            if(i*i>num)return false;
        }
        return false;
    }
}