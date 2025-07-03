class Solution {
    public char kthCharacter(int k) {
        //int val=1;
        String str="a";
        while(str.length()<k)
        {
            int len=str.length();
            String val="";
            for(int i=0;i<len;i++)
            {
                val+=(char)((str.charAt(i)-'a'+1)%26+'a');
            }
            str+=val;
        }
        return str.charAt(k-1);
    }
}