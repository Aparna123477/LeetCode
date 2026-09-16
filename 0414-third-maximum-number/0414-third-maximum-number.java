class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        int k = remove(nums); 
        if (k < 3) {
            return nums[k - 1];
        }
        
      
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