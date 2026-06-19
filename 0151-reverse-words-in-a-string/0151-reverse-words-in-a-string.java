class Solution {
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        String m="";
        for(int i=words.length-1;i>=0;i--){
            if(words[i].length()==0) continue;
            m+=words[i]+" ";
        }
        return m.trim();
    }
}