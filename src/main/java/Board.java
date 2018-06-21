public class Board {
    private final Cell[][] board;

    public Board(final int height, final int width) {
        if (height == 0 || width == 0) {
            throw new IllegalArgumentException();
        }
        this.board = new Cell[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = new Cell(i, j);
            }
        }
    }

    public boolean isWithinLimits(final Board.Cell cell) {
        return cell.x >= 0 && cell.x <= board.length && cell.y >= 0 && cell.y <= board[0].length;
    }

    public static class Cell {
        private final int x, y;

        public Cell(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final Cell cell = (Cell) o;
            return x == cell.x &&
                    y == cell.y;
        }

        @Override
        public int hashCode() {
            return x * 100 + y;
        }

        @Override
        public String toString() {
            return "Cell{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
