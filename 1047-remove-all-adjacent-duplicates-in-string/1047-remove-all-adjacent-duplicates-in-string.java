class Solution {
    public String removeDuplicates(String s) {
     //   StringBuilder str=new StringBuilder(s);
        StringBuilder ns=new StringBuilder();
        for(char ch:s.toCharArray()){
            
            if( ns.length()>0 && ns.charAt(ns.length()-1)==ch){
                ns=ns.deleteCharAt(ns.length()-1);
            }else{
                ns.append(ch);
            }

        }
        return ns.toString();
    }
}
