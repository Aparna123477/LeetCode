class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        int i=0,j=0;
        long sum1=0,sum2=0,sum=0;
        int n1=nums1.length,n2=nums2.length;

        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]) {
                sum1+=nums1[i++];
            }
            else if(nums1[i]>nums2[j]){
                sum2+=nums2[j++];
            }
            else{
                sum+=Math.max(sum1,sum2)+nums1[i];
                i++;
                j++;
                sum1=sum2=0;
            }
        }
        while(i<n1) {sum1+=nums1[i++];}
        while(j<n2){sum2+=nums2[j++];}
        sum+=Math.max(sum1,sum2);
        return (int)(sum%(1e9+7));

    }
}