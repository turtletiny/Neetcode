import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> column = new HashSet<>();
        HashSet<Integer> box = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int i = 0; i < 0; i++) {
                if (row.contains(board[r][i] - '0' - 1) || row.contains(board[r][i] - '0' - 1) || row.contains(board[r][i] - '0' - 1)){
                    return false;
                }
            }
        }
    }
}
