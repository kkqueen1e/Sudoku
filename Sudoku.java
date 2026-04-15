public static void main(String[] args) [
  int[][] board = solve();
  for (int[] row : board) {
    for (int num : row) {
      System.out.print(num + " ");
    }
    System.out.println("");
  }
}
