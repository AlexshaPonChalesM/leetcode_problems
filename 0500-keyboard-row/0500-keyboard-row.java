class Solution {
    public String[] findWords(String[] word) {
        int n=word.length,k=0;
        String ans[]=new String[n];
        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();
        for (char c : "qwertyuiopQWERTYUIOP".toCharArray()) row1.add(c);
        for (char c : "asdfghjklASDFGHJKL".toCharArray()) row2.add(c);
        for (char c : "zxcvbnmZXCVBNM".toCharArray()) row3.add(c);
        for(int i=0;i<n;i++)
        {
            if(check(row1,word[i])||check(row2,word[i])||check(row3,word[i]))
            {
                ans[k++]=word[i];
            }
        }
        return Arrays.copyOf(ans,k);
    }
    public static boolean check(Set<Character> row ,String word)
    {
        for(char c:word.toCharArray())
        {
            if(!row.contains(c))
            {
                return false;
            }
        }
        return true;
    }
}