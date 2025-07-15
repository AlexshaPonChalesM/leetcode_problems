class Solution {
    public boolean isValid(String word) {
        int len=word.length();
        if(len<3)return false;
        Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int vchar=0,cchar=0;
        for(int i=0;i<len;i++)
        {
            char ch=word.charAt(i);
            if(Character.isLetter(ch)){
                if(!set.contains(ch))
                cchar=1;
                else
                vchar=1;
            }
            else if(!Character.isDigit(ch))
            return false;
        }
        if(vchar ==1 && cchar==1)return true;
        return false;
    }
}