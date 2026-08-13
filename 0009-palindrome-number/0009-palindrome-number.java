class Solution {
    public boolean isPalindrome(int x) {
        int orig=x;
        int rev=0;
        while(x>0)
        {
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        if(rev==orig) return true;
        return false;
        
    }
}