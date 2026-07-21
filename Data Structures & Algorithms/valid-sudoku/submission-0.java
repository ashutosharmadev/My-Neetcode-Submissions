class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Stores all digits seen in each column
        Map<Integer, Set<Character>> cols = new HashMap<>();

        // Stores all digits seen in each row
        Map<Integer, Set<Character>> rows = new HashMap<>();

        // Stores all digits seen in each 3x3 sub-box
        // Key format: "0,0", "0,1", ..., "2,2"
        Map<String, Set<Character>> squares = new HashMap<>();

        // Traverse every cell in the Sudoku board
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                // Skip empty cells
                if (board[r][c] == '.') {
                    continue;
                }

                // Identify the current 3x3 box
                // Example:
                // (0,0), (1,2), (2,1) -> "0,0"
                // (4,5) -> "1,1"
                // (8,8) -> "2,2"
                String squareKey = (r / 3) + "," + (c / 3);

                // computeIfAbsent():
                // If the key doesn't exist, create a new HashSet.
                // Then check whether the current digit is already present
                // in the row, column, or box.
                if (rows.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c]) ||
                    cols.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c]) ||
                    squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[r][c])) {

                    // Duplicate found
                    return false;
                }

                // Add the current digit to the row, column, and box
                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                squares.get(squareKey).add(board[r][c]);
            }
        }

        // No duplicates found
        return true;
    }
}