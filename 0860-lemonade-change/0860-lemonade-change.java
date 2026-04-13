class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five_doll=0;
        int ten_doll=0;
        int twenty_doll=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) five_doll++;

            else if(bills[i]==10){ 
                if(five_doll>0){
                     five_doll--;
                     ten_doll++;}

                else return false;
            }
            else 
            {
                if(ten_doll>0 && five_doll>0){ five_doll--; ten_doll--;}
                else if(five_doll>=3){ 
                    five_doll-=3;
                }
                else {
                    return false;
                }
        }
      
    }
     return true;
    }
}