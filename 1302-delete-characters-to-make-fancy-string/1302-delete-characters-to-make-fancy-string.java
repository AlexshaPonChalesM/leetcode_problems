class Solution {
    public String makeFancyString(String s) {
        int len=s.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<len)
        {
            char ch=s.charAt(i);
            int count=0;
            while(i<len && ch==s.charAt(i))
            {
                count++;
                i++;
                if(count<=2)sb.append(ch);
            }
        } 
        return sb.toString();
    }
}