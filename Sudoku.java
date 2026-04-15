public class Sudoku {
  public static void main(String[] args) [
    int[][] board = solve();
    for (int[] row : board) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println("");
    }
  }

  public static int[][] solve() {
    int[][] board;
    boolean solved = false;
    while (!solved) {
      board = new int[9][9];
      solved = isFilled(board);
      if (solved) {
        return board;
      }
    }
    return null;
  }

  private static boolean isFilled(int[][] board) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == 0) {
          int start = (int)(Math.random()*9) + 1;
          for (int s = 0; s < 9; s++) {
            int num = (start + i - 1) % 9 + 1;
            if (isValid(board, i, j, num) {
              board[i][j] = num;
              if (isFilled(board)) {
                return true;
              }
              board[i][j] = 0;
            }
          }
          return false;
        }
      }
    }
    return true;
  }

  private static boolean isValid(int[][] board, int i, int j, int num) {
    for (int q = 0; q < 9; q++) {
      if (board[i][q] == num || board[q][j] == num) {
        return false;
      }
    }
    int row = i - i%3;
    int col = j - j%3;
    for (int r = row; r < row+3; r++) {
      for (int c = col; c < col+3; c++) {
        if (board[r][c] == num) {
          return false;
        }
      }
    }
    return true;
  }
}
