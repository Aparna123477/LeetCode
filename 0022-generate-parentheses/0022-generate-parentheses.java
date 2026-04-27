class Solution {
    public List<String> generateParenthesis(int n) {
       List<String>list=new ArrayList<>();
      
      func(n,0,0,"",list);
      return list;

    }
    static void func(int n,int o,int c,String s,List<String>list){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(o<n){
            func(n,o+1,c,s+"(",list);
            }
        if(c<o){
                func(n,o,c+1,s+")",list);
            }
    }
}