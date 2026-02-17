class Solution {
    public int totalFruit(int[] fruits) {
        int[] freq=new int[100001];
        int type=0;
        int max=0;
        int s=0;
        for(int i=0;i<fruits.length;i++){
           int f=freq[i];
           if(freq[f]==0) type++;
           freq[f]++;
           while(type>2){
            int sf=fruits[s];
            freq[sf]--;
            if(freq[sf]==0) type--;
            s++;
           }
           int pick=i-s+1;
            
            max=Math.max(max,pick);

        }
        return max;

        
    }
}