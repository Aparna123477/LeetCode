class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));

        int max=0;

        for(int[] box:boxTypes){
            int bx=box[0];
            int up_bx=box[1];

            if(truckSize>=bx){
                max+=bx*up_bx;
                truckSize-=bx;
            }
            else{
                max+=truckSize*up_bx;
                break;
            }
        }return max;
    }
}