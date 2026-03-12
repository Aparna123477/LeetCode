class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int max=0;
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch]++;
            while(freq[ch]>1){
                char size=s.charAt(start++);
                freq[size]--;
            }
            int size2=i-start+1;
            max=Math.max(max,size2);
        }
        return max;
        
    }
}