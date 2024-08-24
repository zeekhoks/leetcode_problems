package data_structures.Arrays;

import java.util.*;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        return validateRows(board) && validateColumns(board) && validateGrids(board);
    }

    public boolean validateRows(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) {
                        return false;
                    } else {
                        rowSet.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }

    public boolean validateColumns(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Set<Character> colSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (colSet.contains(board[j][i])) {
                        return false;
                    } else {
                        colSet.add(board[j][i]);
                    }
                }
            }
        }

        return true;
    }

    public boolean validateGrids(char[][] board) {

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Set<Character> gridSet = new HashSet<>();
                for (int x = i; x < i + 3; x++) {

                    for (int y = j; y < j + 3; y++) {
                        if (board[x][y] != '.') {
                            if (gridSet.contains(board[x][y])) {
                                return false;
                            } else {
                                gridSet.add(board[x][y]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidSudoku solution = new ValidSudoku();

        char[][] board = {
                { '.', '.', '.', '.', '5', '.', '.', '1', '.' },
                { '.', '4', '.', '3', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '3', '.', '.', '1' },
                { '8', '.', '.', '.', '.', '.', '.', '2', '.' },
                { '.', '.', '2', '.', '7', '.', '.', '.', '1' },
                { '.', '1', '5', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '2', '.', '.', '.' },
                { '.', '2', '.', '9', '.', '.', '.', '.', '.' },
                { '.', '.', '4', '.', '.', '.', '.', '.', '.' } };

        boolean validSudoku = solution.isValidSudoku(board);

        System.out.println("Is the board valid? Answer : " + validSudoku);
    }

}
