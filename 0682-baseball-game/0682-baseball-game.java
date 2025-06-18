class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        int n=operations.length;
        for(int i=0;i<n;i++)
        {
            String ch = operations[i];
            if(ch.equals("+"))
            {
                int val1=s.pop();
                int val2=s.peek();
                s.push(val1);
                s.push(val1+val2);
            }
            else if(ch.equals("D"))
            {
                int num=s.peek();
                s.push(num*2);
            }
            else if(ch.equals("C"))
            {
                s.pop();
            }
            else
            {
                int val=Integer.parseInt(ch);;
                s.push(val);
            }
        }
        int sum=0;
        while(!s.isEmpty())
        {
            sum+=s.pop();
        }
        return sum;
    }
}