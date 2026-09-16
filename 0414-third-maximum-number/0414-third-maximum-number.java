class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        int k = remove(nums); // Get total distinct elements
        
        // If fewer than 3 distinct elements, return the maximum (at k - 1)
        if (k < 3) {
            return nums[k - 1];
        }
        
        // 3rd maximum is at index k - 3
        return nums[k - 3];
    }

    int remove(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}