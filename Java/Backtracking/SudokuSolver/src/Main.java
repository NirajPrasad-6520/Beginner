package Backtracking.SudokuSolver.src;

public class Main
{
    public static void main(String[] args)
    {
        // Create an instance of the Solution class, which contains the Sudoku solving logic
        Solution solution = new Solution();

        // Define the Sudoku board as a 2D character array
        // '.' represents empty cells to be filled by the solver
        char[][] board =
        {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Solve the Sudoku puzzle using the Solution class
        solution.solveSudoku(board);

        // Print the solved Sudoku board
        System.out.println("Solved Sudoku Board:");
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                System.out.print(board[i][j] + " ");  // Print each cell of the board
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}