class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i:nums)
        {
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        return gcd(min,max);
    }
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}