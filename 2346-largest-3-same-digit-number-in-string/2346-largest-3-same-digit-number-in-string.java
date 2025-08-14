class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        String ans="";
        int max=Integer.MIN_VALUE,flag=1;
        char value='0';
        for(int i=0;i<n;i++)
        {
            char ch=num.charAt(i);
            int count=0;
            while(i<n && ch==num.charAt(i))
            {
                count++;
                i++;
            }
            i--;
            System.out.println(count);
            if(count>=3)
            {
                flag=0;
                int val=ch-'0';
                System.out.println(val);
                if(val>max)
                {
                    max=Math.max(max,val);
                    value=ch;
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            ans+=value;
        }
        if(flag==1)return "";
        return ans;
    }
}