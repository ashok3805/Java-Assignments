package Assignment_15;

import java.util.*;

public class RatinMaze {

    static List<String> result = new ArrayList<>();
    public static List<String> findPaths(int[][] maze, int n) {
        boolean[][] visited = new boolean[n][n];
        
        if (maze[0][0] == 0) return result;  
        solve(maze, n, 0, 0, "", visited);
        return result;
    }
    static int[] rowMove = {1, 0, 0, -1};
    static int[] colMove = {0, -1, 1, 0};
    static char[] dir = {'D', 'L', 'R', 'U'};
    public static void solve(int[][] maze, int n, int x, int y, String path, boolean[][] visited) {
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int newX = x + rowMove[i];
            int newY = y + colMove[i];

            if (x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1 && !visited[x][y]) {
                visited[x][y] = true;
                solve(maze, n, newX, newY, path + dir[i], visited);
                visited[x][y] = false;  
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] maze = {{1, 0, 0, 0},{1, 1, 0, 1},{0, 1, 0, 0},{1, 1, 1, 1}};
        List<String> paths = findPaths(maze, n);
        if (paths.isEmpty()) {
            System.out.println("No path found");
        } else {
            for (String path : paths) {
                System.out.println(path);
            }
        }
    }
}
