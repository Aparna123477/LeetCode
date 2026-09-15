class Solution {
    public int heightChecker(int[] heights) {
        //O(NlogN) ,O(N)
        int count=0;
        int[] exp=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            exp[i]=heights[i];
        }
        Arrays.sort(exp);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=exp[i])count++;
        }
        return count;

    }
}