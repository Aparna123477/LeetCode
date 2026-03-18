class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        for(int i:nums1)list.add(i);
        for(int i:nums2)list.add(i);
        Collections.sort(list);
        
        int n=list.size();
        if(n%2!=0) return (double)list.get(n/2);
    
        else {
            int a=list.get(n/2);
            int b=list.get(n/2 -1);
            return (a+b)/2.0;
        }

    }
    //return 0;
}