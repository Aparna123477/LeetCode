class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int  num=1;
        int  startingRow=0;
        int endingRow=n-1;
        int startingCol=0;
        int endingCol=n-1;

        while(startingRow <=endingRow && startingCol <= endingCol)
        {
            //left to right
            for(int col=startingCol;col<=endingCol;col++)
            {
                matrix[startingCol][col]=num;
                num++;
            }
            startingRow++;

            //top to bottom
            for(int row=startingRow;row<=endingRow;row++)
            {
                matrix[row][endingCol]=num;
                num++;
            }
            endingCol--;

            //right to left
            if(startingRow<=endingRow){
            for(int col=endingCol;col>=startingCol;col--)
            {
                matrix[endingRow][col]=num;
                num++;
            }
            endingRow--;}

            //bottom to top
            if(startingCol<=endingCol){
            for(int row=endingRow;row>=startingRow;row--)
            {
                matrix[row][startingCol]=num;
                num++;
            }
            startingCol++;}
        }
        return matrix;
    }
}