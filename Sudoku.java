public static void main(String[] args) [
  int[][] board = new int[9][9];
  fill(board);
  for (int[] row : board) {
    for (int num : row) {
      System.out.print(num + " ");
    }
    System.out.println("");
  }
}
