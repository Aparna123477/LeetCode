class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right=height.length-1;
        int max_area=0;
        while(left<right)
        {
            int width=right-left;
            int min=Math.min(height[left],height[right]);
            int curr=width*min;
            max_area=Math.max(max_area,curr);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }return max_area;
    }
}