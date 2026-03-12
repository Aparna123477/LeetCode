class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        int k=p.length();
        int[] fr1=new int[26];
        for(char ch:p.toCharArray()){
            fr1[ch-'a']++;
        }
        int[] fr2=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fr2[ch-'a']++;
            if(i<k-1) continue;
            if(Arrays.equals(fr1,fr2)) result.add(i-k+1);
            int size=i-k+1;
            int res=s.charAt(size);
            fr2[res-'a']--;
        }
        return result;

    }
}