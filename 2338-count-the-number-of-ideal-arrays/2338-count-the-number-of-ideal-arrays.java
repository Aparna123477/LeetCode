class Solution {
    static int mod=1000000007;
    static int MAXE=14;
    public int idealArrays(int n, int maxValue) {
        
        long[][] c=new long[n+MAXE][MAXE+1];
        for(int i=0;i<n+MAXE;i++){
            c[i][0]=1;
            for(int j=1;j<=Math.min(i,MAXE);j++){
                c[i][j]=(c[i-1][j]+c[i-1][j-1])%mod;
            }
        }
        long ans=0;
        for(int val=1;val<=maxValue;val++){
            int x=val;
            long ways=1;
            for(int p=2;p*p<=x;p++){
                int exp=0;
                while(x%p==0){
                    exp++;
                    x/=p;
                }
                if(exp>0){
                    ways=ways=(ways*c[n+exp-1][exp])%mod;
                }
            }
         if(x>1){
            ways=(ways*c[n][1])%mod;
         }   
         ans=(ans+ways)%mod;
        }
        return (int)ans;

        
    }
}