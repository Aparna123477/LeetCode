class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;

        List<Integer> l=new ArrayList<>();
        for(int i :nums1) l.add(i);
        for(int j :nums2) l.add(j);
        Collections.sort(l);

        int k=l.size();
        if(k%2!=0) return (double) l.get(k/2);
        else {
            return (double) (l.get(k/2)+l.get(k/2-1))/2;
        }
        
    }
}