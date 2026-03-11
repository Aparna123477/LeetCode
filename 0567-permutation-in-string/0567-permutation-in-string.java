class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        for(int i=0;i<=s2.length()-k;i++){
            String sub=s2.substring(i,i+k);
            if(isAnagram(s1,sub)) return true;
        }
        return false;}

     public static boolean isAnagram(String s,String n){
            int[] f1=new int[26];
            for(char ch: s.toCharArray()){
                f1[ch-'a']++;
            }
            int[] f2=new int[26];
            for(char ch:n.toCharArray()){
                f2[ch-'a']++;
            }
            return Arrays.equals(f1,f2);
        }
      

        
    }
