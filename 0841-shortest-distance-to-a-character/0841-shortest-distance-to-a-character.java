class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int arr[]=new int[n];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                l.add(i);
            }
        }
        int len=l.size();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==c)arr[i]=0;
            else
            {
                int max=Integer.MAX_VALUE;
                for(int j=0;j<len;j++)
                {
                    int val=Math.abs(l.get(j)-i);
                    max=Math.min(max,val);
                }
                arr[i]=max;
            }
        }
        return arr;
    }
}