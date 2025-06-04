class Solution {
    public String[] findWords(String[] words) {
        int n=words.length,k=0;
        String ans[]=new String[n];
        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();
        for (char c : "qwertyuiopQWERTYUIOP".toCharArray()) row1.add(c);
        for (char c : "asdfghjklASDFGHJKL".toCharArray()) row2.add(c);
        for (char c : "zxcvbnmZXCVBNM".toCharArray()) row3.add(c);
        for(int i=0;i<n;i++)
        {
            int len=words[i].length();
            int flag=1;
            for(int j=0;j<len;j++)
            {
                if(!row1.contains(words[i].charAt(j)))
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                ans[k++]=words[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            int len=words[i].length();
            int flag=1;
            for(int j=0;j<len;j++)
            {
                if(!row2.contains(words[i].charAt(j)))
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                ans[k++]=words[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            int len=words[i].length();
            int flag=1;
            for(int j=0;j<len;j++)
            {
                if(!row3.contains(words[i].charAt(j)))
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                ans[k++]=words[i];
            }
        }
        return Arrays.copyOf(ans,k);
    }
}