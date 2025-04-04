
class SudokuSolver {

    fun solveSudoku(board: Array<IntArray>): Boolean {
        return solve(board)
    }

    fun solve(board: Array<IntArray>): Boolean {
        for(row in board.indices) {
            for(col in board[row].indices) {
                if (board[row][col] == 0) { // Empty cell
                    for(num in 1..9) {
                        if(isValid(board, row, col, num)) {
                            board[row][col] = num
                            if (solve(board)) return true
                            board[row][col] = 0
                        }
                    }
                    return  false
                }
            }
        }
        return true
    }

    fun isValid(board: Array<IntArray>, row: Int, col: Int, num: Int): Boolean {
        for(i in 0..8) {
            if(board[row][i] == num || board[i][col] == num ||
                board[row / 3*3 + i / 3][col / 3*3 + i % 3] == num) {
                return false
            }
        }
        return true
    }
}
