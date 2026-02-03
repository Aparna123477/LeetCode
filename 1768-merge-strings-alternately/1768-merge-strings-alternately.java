class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int left=0;
        int right=0;
        while(left<word1.length() && right<word2.length()){
            res=res+word1.charAt(left)+word2.charAt(right);
            left++;right++;
        }
        while(left<word1.length()) res+=word1.charAt(left++);
        while(right<word2.length()) res+=word2.charAt(right++);
        
        return res;
    }
}