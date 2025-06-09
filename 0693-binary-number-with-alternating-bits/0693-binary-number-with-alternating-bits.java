class Solution {
    public boolean hasAlternatingBits(int n) {
        ArrayList<Integer> s=new ArrayList<>();
        while(n>0)
        {
            s.add(n%2);
            n/=2;
        }
        Collections.reverse(s);
        int arr[]=new int[s.size()];
        int j=0;
        for(int i:s)
        {
            arr[j++]=i;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            return false;
        }
        return true;
    }
}