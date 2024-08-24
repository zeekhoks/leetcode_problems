package data_structures.Graphs;

public class MaximumArea {

    public static void main(String[] args) {

        char[][] grid = {
            {'0', '0', '1', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '0', '0', '0'},
            {'0', '1', '1', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '1', '0', '0', '1', '1', '0', '0', '1', '0', '1', '0', '0'},
            {'0', '1', '0', '0', '1', '1', '0', '0', '1', '1', '1', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '1', '1', '0', '0', '0', '0'}
        };

        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        int result = 0;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    // int area = dfs(grid, i, j, m, n, visited);
                    maxArea = Math.max(maxArea, dfs(grid, i, j, m, n, visited, result));
                }
            }
        }
        System.out.println("Maximum Area of islands is : " + maxArea);
    }

    public static int dfs(char[][] grid, int i, int j, int m, int n, boolean[][] visited, int result) {


        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0' || visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;

        int[] rows = { -1, 0, 1, 0 };
        int[] cols = { 0, -1, 0, 1 };
        for (int index = 0; index < 4; index++) {
            int x = rows[index] + i;
            int y = cols[index] + j;
            result += dfs(grid, x, y, m, n, visited, result);
            System.out.println(result);
        }
        return result+1;
    }

}
