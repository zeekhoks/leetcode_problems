package data_structures.Graphs;

import java.util.*;

class Pair {
    int row;
    int column;

    Pair(int row, int column) {
        this.row = row;
        this.column = column;
    }
}

public class RottingOranges {

    public static void main(String[] args) {
        int[][] grid = {
                { 2, 1, 1 },
                { 1, 1, 0 },
                { 0, 1, 1 },
        };

        Queue<Pair> queue = new LinkedList<>();

        int m = grid.length;
        int n = grid[0].length;
        int minute = 0;
        int fresh = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1)
                    fresh = fresh + 1;
                if (grid[i][j] == 2)
                    queue.add(new Pair(i, j));
            }
        }

        int[] rows = { -1, 0, 1, 0 };
        int[] cols = { 0, -1, 0, 1 };
        while (queue.size() > 0 && fresh > 0) {
            for (int i = 0; i < queue.size(); i++) {
                Pair removedOrange = queue.poll();
                for (int index = 0; index < 4; index++) {
                    int x = rows[index] + removedOrange.row;
                    int y = cols[index] + removedOrange.column;
                    if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != 1)
                        continue;
                    grid[x][y]=2;
                    queue.add(new Pair(x, y));
                    fresh = fresh-1;
                }
            }
            minute = minute+1;
        }

        if(fresh==0) {
            System.out.println("Number of minutes till all oranges are rotten : " + minute);
        } else {
            System.out.println("Number of minutes till all oranges are rotten : " + -1 );
        }
    }

}
