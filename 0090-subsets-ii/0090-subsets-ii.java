class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        func(nums, ans, new ArrayList<>(), 0);

        return ans;
    }

    void func(int[] arr,
              List<List<Integer>> ans,
              List<Integer> curr,
              int idx) {

        ans.add(new ArrayList<>(curr));

        for (int i = idx; i < arr.length; i++) {

            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }

            curr.add(arr[i]);

            func(arr, ans, curr, i + 1);

            curr.remove(curr.size() - 1);
        }
    }
}