class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        
        int startingRow = 0;
        int endingRow = r - 1;
        int startingCol = 0;
        int endingCol = c - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            // 1. Traverse Right: startingCol -> endingCol along startingRow
            for (int col = startingCol; col <= endingCol; col++) {
                list.add(matrix[startingRow][col]);
            }
            startingRow++;

            // 2. Traverse Down: startingRow -> endingRow along endingCol
            for (int row = startingRow; row <= endingRow; row++) {
                list.add(matrix[row][endingCol]);
            }
            endingCol--;

            // 3. Traverse Left: endingCol -> startingCol along endingRow
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    list.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            // 4. Traverse Up: endingRow -> startingRow along startingCol
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    list.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }
        return list;
    }
}