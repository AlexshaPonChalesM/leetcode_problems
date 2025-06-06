class Solution {
    public int maxArea(int[] height) {
        int low=0,high=(height.length)-1,ans=0;
        while(low<high)
        {
            int values=(high-low) * ((height[low]<height[high])?height[low]:height[high]);
            ans=(values>ans)?values:ans;
            if(height[low]<height[high])
            low++;
            else
            high--;
        }
        return ans;
    }
}