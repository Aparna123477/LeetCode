class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(String word:words){
            res.append(new StringBuilder(word).reverse()).append(" ");
        }
        return res.toString().trim();
    }
}