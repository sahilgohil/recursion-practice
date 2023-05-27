public class FloodFill{
  static void floodFill(int[][] maze, int row, int col, String asf, boolean[][] visited)
    {
        if(row<0 || col<0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true)
        {
            return;
        }
        if(row == maze.length-1 && col == maze[0].length-1)
        {
            System.out.println(asf);
        }

        visited[row][col] = true;
        floodFill(maze, row-1,col, asf+"t",visited);
        floodFill(maze, row,col-1, asf+"l",visited);
        floodFill(maze, row+1,col, asf+"d",visited);
        floodFill(maze, row,col+1, asf+"r",visited);
        visited[row][col] = false;
    }
}
