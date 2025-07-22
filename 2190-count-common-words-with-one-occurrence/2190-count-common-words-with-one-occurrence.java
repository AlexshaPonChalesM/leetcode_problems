class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> mp=new HashMap<>();
        int n=words1.length;
        for(int i=0;i<n;i++)
        {
            map.put(words1[i],map.getOrDefault(words1[i],0)+1);
        }
        int m=words2.length;
        for(int i=0;i<m;i++)
        {
            mp.put(words2[i],mp.getOrDefault(words2[i],0)+1);
        }
        int count=0;
        for(int i=0;i<m;i++)
        {
            if(map.containsKey(words2[i]) && map.get(words2[i])==1 && mp.get(words2[i])==1)
            {
                count++;
            }
        }
        return count;
    }
}