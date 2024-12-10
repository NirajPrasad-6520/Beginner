package Backtracking.SudokuSolver.src;
// The Solution class contains the logic for solving the Sudoku puzzle
public class Solution
{
    // Method to check if it's safe to place a number in a given cell
    public boolean isSafe(char[][] board, int row, int col, int number)
    {
        // Check if the number exists in the current column
        for (int i = 0; i < board.length; i++)
        {
            if (board[i][col] == (char) (number + '0'))
            {
                return false;  // The number already exists in the column
            }
        }

        // Check if the number exists in the current row
        for (int j = 0; j < board.length; j++)
        {
            if (board[row][j] == (char) (number + '0'))
            {
                return false;  // The number already exists in the row
            }
        }

        // Check if the number exists in the current 3x3 sub-box
        int sr = 3 * (row / 3); // Starting row of the 3x3 sub-box
        int sc = 3 * (col / 3); // Starting column of the 3x3 sub-box

        // Iterate through the 3x3 sub-box
        for (int i = sr; i < sr + 3; i++)
        {
            for (int j = sc; j < sc + 3; j++)
            {
                if (board[i][j] == (char) (number + '0'))
                {
                    return false;  // The number already exists in the sub-box
                }
            }
        }
        return true;  // The number can be safely placed in the cell
    }
    // Recursive helper function to solve the Sudoku puzzle
    public boolean helper(char[][] board, int row, int col)
    {
        // If we've reached the end of the board, return true (solution found)
        if (row == board.length)
        {
            return true;
        }

        int nrow = 0;  // Row for the next recursive call
        int ncol = 0;  // Column for the next recursive call

        // Move to the next cell in the row or to the next row if we are at the last column
        if (col == board.length - 1)
        {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }
        // If the current cell is not empty (i.e., it is a given number), move to the next cell
        if (board[row][col] != '.')
        {
            return helper(board, nrow, ncol);  // Recursively check the next cell
        } else {
            // Try placing each number (1-9) in the empty cell
            for (int i = 1; i <= 9; i++)
            {
                // If placing the number is safe, place it and recursively try to solve the rest
                if (isSafe(board, row, col, i))
                {
                    board[row][col] = (char) (i + '0');  // Place the number in the cell
                    if (helper(board, nrow, ncol))  // Recursively solve the next cells
                    {
                        return true;  // If solving the next cells is successful, return true
                    }
                    else
                    {
                        board[row][col] = '.';// Backtrack: Remove the number if it doesn't lead to a solution
                    }
                }
            }
        }
        return false;  // Return false if no valid number could be placed in the current cell
    }
    // Main method to solve the Sudoku puzzle
    public void solveSudoku(char[][] board)
    {
        helper(board, 0, 0);  // Start solving from the first cell (0, 0)
    }
}