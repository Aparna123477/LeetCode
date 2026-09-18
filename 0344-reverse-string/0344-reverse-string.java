class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int right=s.length-1;
        while(start<right)
        {
            char tmp=s[right];
            s[right--]=s[start];
            s[start++]=tmp;
        }
       
    }
}