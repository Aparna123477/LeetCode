class Solution {
    public int minDistance(String word1, String word2) {
        Integer[][] dp=new Integer[word1.length()][word2.length()];
        return func(word1,word2,0,0,dp);
    }
    int func(String s,String t,int i,int j,Integer[][] dp ){
        if(i ==s.length()) return t.length()-j;
        if(j==t.length()) return s.length()-i;

        if(dp[i][j]!=null) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
           return  dp[i][j]=func(s,t,i+1,j+1,dp);

        }
        else{
            int a=1+func(s,t,i,j+1,dp);
            int b=1+func(s,t,i+1,j,dp);
            int c=1+func(s,t,i+1,j+1,dp);

            return dp[i][j]=Math.min(a,Math.min(b,c));
        }
        
    }
}