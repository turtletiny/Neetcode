class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            // Column Checking
            int[] columnCount = new int[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][r] != '.') {
                    columnCount[board[i][r] - '0' - 1] ++;
                }
            }
            for (int num : columnCount) {
                if (num > 1) {
                    return false;
                }
            }
            // Row Check
            int[] rowCount = new int[9];
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] != '.') {
                    rowCount[board[r][c] - '0' - 1] ++;
                }
            }
            for (int num : rowCount) {
                if (num > 1) {
                    return false;
                }
            }
        }
        for (int i = 0; i < 9; i++){
            int[] boxCount = new int[9];
            for (int j = 0; j < 3; j++){
                for (int k = 0; k < 3; k++){
                    boxCount[board[][] - '0' - 1] ++;
                }

            }
        }



        return true;
    }
}
