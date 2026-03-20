class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
       
       List<Integer>arr=new ArrayList<>();
       for(int i:nums1) arr.add(i);
       for(int i:nums2) arr.add(i);
       Collections.sort(arr);
       int n=arr.size();
       if(n%2!=0) return  arr.get(n/2);
       else{
           return  (double) (arr.get(n/2)+arr.get(n/2-1))/2;
       }
        
    }
}