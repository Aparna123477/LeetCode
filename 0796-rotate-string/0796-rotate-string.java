class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        for(int i=0;i<=n;i++){
            String sub=s.substring(i)+s.substring(0,i);
            if(sub.equals(goal)) return true;;
        }
        return false;
    }
}