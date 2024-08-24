package data_structures.Graphs;

import java.util.*;

public class PacificAtlanticWaterFlow {

    public static void main(String[] args) {
        int[][] heights = {
                { 1, 2, 2, 3, 5 },
                { 3, 2, 3, 4, 4 },
                { 2, 4, 5, 3, 1 },
                { 6, 7, 1, 4, 5 },
                { 5, 1, 1, 2, 4 },
        };

        List<List<Integer>> result = new ArrayList<>();

        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int j = 0; j < n; j++) {
            dfs(heights, 0, j, pacific.length, pacific[0].length, pacific, Integer.MIN_VALUE);
            dfs(heights, m - 1, j, atlantic.length, atlantic[0].length, atlantic, Integer.MIN_VALUE);

        }

        for (int i = 0; i < m; i++) {
            dfs(heights, i, 0, pacific.length, pacific[0].length, pacific, Integer.MIN_VALUE);
            dfs(heights, i, n - 1, atlantic.length, atlantic[0].length, atlantic, Integer.MIN_VALUE);

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(List.of(i, j));
                }
            }
        }

        for (List<Integer> temp : result) {
            System.out.println("List of grid coordinates : " + temp);
        }
    }

    private static void dfs(int[][] heights, int row, int column, int m, int n, boolean[][] visit, int prevHeight) {
        if (visit[row][column] || row < 0 || column < 0 || row >= m || column >= n || heights[row][column] < prevHeight)
            return;
        visit[row][column] = true;
        int[] rows = { -1, 0, 1, 0 };
        int[] cols = { 0, -1, 0, 1 };
        for (int index = 0; index < 4; index++) {
            int ri = rows[index] + row;
            int ci = cols[index] + column;
            dfs(heights, ri, ci, m, n, visit, heights[row][column]);
        }
    }

}
