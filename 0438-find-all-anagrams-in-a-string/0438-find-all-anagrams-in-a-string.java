class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr=new ArrayList<>();
        int[] fr1=new int[26];
        int k=p.length();
        for(char ch: p.toCharArray()){
            fr1[ch-'a']++;
        }
        int[] fr2=new int[26];
        int count=0;
    
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fr2[ch-'a']++;
            if(i<k-1) continue;
            if(Arrays.equals(fr1,fr2)) arr.add(i-k+1);
            int sin=i-k+1;
            fr2[s.charAt(sin)-'a']--;

        }
        return arr;
        
    }
}