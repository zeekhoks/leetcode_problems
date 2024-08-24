package data_structures.Graphs;

public class NumberOfIslands {

    public static void main(String[] args) {

        char[][] grid = {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' }
        };

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j, m, n, visited);
                    count += 1;
                }
            }
        }
        System.out.println("Number of islands are : " + count);
    }

    public static void dfs(char[][] grid, int i, int j, int m, int n, boolean[][] visited) {

        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        int[] rows = { -1, 0, 1, 0 };
        int[] cols = { 0, -1, 0, 1 };
        for (int index = 0; index < 4; index++) {
            int x = rows[index] + i;
            int y = cols[index] + j;
            dfs(grid, x, y, m, n, visited);
        }
    }

}
