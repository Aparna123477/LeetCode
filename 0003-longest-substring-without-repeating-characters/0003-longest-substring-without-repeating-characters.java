class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[256];
            int count=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
            if(freq[ch]==1){
                break;
            }
            else{
                freq[ch]++;
                count++;
            }

            }
            max=Math.max(max,count);

        }
        return max;

    }
}