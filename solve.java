public int[][] solve() {
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
