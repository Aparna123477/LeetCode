class Solution {
     Set<Integer>set=new HashSet<>();
        int count[]=new int[10];
    public int[] findEvenNumbers(int[] digits) {
      
        for(int d:digits){
            count[d]++;
        }
        backtrack(0,0);
        int[] res=set.stream().mapToInt(x->x).toArray();
        Arrays.sort(res);
        return res;
    }
    private void backtrack(int pos,int num){
        if(pos==3){set.add(num);return;}
        for(int i=0;i<=9;i++) {
            if(count[i]==0)continue;
            if(i==0 && pos==0)continue;
            if(pos==2 && i%2!=0)continue;
            count[i]--;
            backtrack(pos+1,num*10+i);
            count[i]++;

        }
    }
}