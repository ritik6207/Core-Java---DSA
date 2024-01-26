public class Print_N_QueenProblem {
    public static void printSolution(int[][] board, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Check Queen is safe or not
    public static boolean isSafe(int[][] board, int row, int col, int n)
    {
        int i, j;
        //check on the left row
        for(i = 0; i < col; i++)
        {
            if(board[row][i] == 1)
            {
                return false;
            }
        }

        //check for the upper diagonal in the left direction
        for(i = row, j = col; i >= 0 && j >= 0; i--, j--)
        {
            if(board[i][j] == 1)
            {
                return false;
            }
        }

        //check for the lower diagonal in the left direction
        for(i = row, j = col; i < n && j >= 0; i++, j--)
        {
            if(board[i][j] == 1)
            {
                return false;
            }
        }
        return true;
    }

   public static boolean solveNQueen(int[][] board, int col, int n)
    {
        /*
        Base case:- if you placed all the queen then return ture
        * */
        if(col >= n){
            return true;
        }

        //Consider the column and try to place all the queen in all the rows one by one
        for(int i = 0; i < n; i++)
        {
            //check if it is safe to place queen or not
            if(isSafe(board, i, col, n) == true)
            {
                //place the queen on board
                board[i][col] = 1;

                //recursive call to place all queen
                if(solveNQueen(board, col + 1, n) == true){
                    return true;
                }

                //if placing the queen does not lead to solution then backtrack
                board[i][col] = 0;
            }
        }
        //if it is not possible to place all the queen in any row of the given column then return false
        return false;
    }
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},};
        if(solveNQueen(board, 0, board.length) == true)
        {
            printSolution(board, board.length);
        }
        else {
            System.out.println("Solution does not exist");
        }
    }
}
