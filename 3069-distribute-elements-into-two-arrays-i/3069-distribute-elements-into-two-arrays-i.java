public class Solution {
    public int[] resultArray(int[] nums) {

        int len = nums.length;
        int i1 = 0, i2 = 0;

        int[] arr1 = new int[len];
        int[] arr2 = new int[len];

        arr1[i1++] = nums[0];
        arr2[i2++] = nums[1];

        for (int i = 2; i < len; i++) {
            if (arr1[i1 - 1] > arr2[i2 - 1])
                arr1[i1++] = nums[i];
            else
                arr2[i2++] = nums[i];
        }

        int[] res = new int[len];
        int ind = 0;

        for (int i = 0; i < i1; i++)
            res[ind++] = arr1[i];

        for (int i = 0; i < i2; i++)
            res[ind++] = arr2[i];

        return res;
    }
}