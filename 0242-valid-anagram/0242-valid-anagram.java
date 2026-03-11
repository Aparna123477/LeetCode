class Solution {
    public boolean isAnagram(String s, String t) {
        int k=s.length();
        int[] fr1=new int[26];
        for(char ch:s.toCharArray()){
            fr1[ch-'a']++;
        }
        int[] fr2=new int[26];
        for(char ch:t.toCharArray()){
            fr2[ch-'a']++;
        }
        return Arrays.equals(fr1,fr2);
    }
}