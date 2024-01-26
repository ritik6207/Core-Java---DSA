public class RatInAMaze {
    public static int countPaths(int[][] maze, int n)
    {
        //if source and destination are block return 0
        if(maze[0][0] == -1 || maze[n - 1][n - 1] == -1)
        {
            return 0;
        }

        //initialize the topmost column
        for(int i = 0; i < n; i++)
        {
            if(maze[i][0] == 0)
            {
                maze[i][0] = 1;
            }
            //if there is blockage then break
            else {
                break;
            }
        }

        //initialize the topmost row
        for(int i = 1; i <n; i++)
        {
            if(maze[0][i] == 0)
            {
                maze[0][i] = 1;
            }
            //if there is blockage then break
            else {
                break;
            }
        }

        //if maze[i][j] = -1 then ignore , otherwise compute the value of count recursively
        for(int i = 1; i < n; i++)
        {
            for(int j = 1; j < n; j++)
            {
                //check for blockage
                if(maze[i][j] == -1){
                    continue;
                }

                //if we can reach maze [i][j] form maze[i-1][j] then increment the count
                if(maze[i-1][j] > 0)
                {
                    maze[i][j] = maze[i][j] + maze[i-1][j];
                }

                //if we can reach maze [i][j] form maze[i][j-1] then increment the count
                if(maze[i][j-1] > 0)
                {
                    maze[i][j] = maze[i][j] + maze[i][j-1];
                }
            }
        }
        return maze[n - 1][n - 1];
    }
    public static void main(String[] args) {
        int[][] maze = {{0, 0, 0, 0},
                        {0, -1, 0, 0},
                        {-1, 0, 0, 0},
                        {0, 0, 0, 0}};
        int n = maze.length;
        int cnt = countPaths(maze, n);
        System.out.println("Count: " + cnt);
    }
}
