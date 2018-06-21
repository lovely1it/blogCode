public class SecondMovementStrategy extends MovementStrategy {
    @Override
    public void setMoves() {
        for (int i = 0; i < 9; i++) {
            movements.put(new Board.Cell(i, 0), new Board.Cell(i + 1, 0));
        }
        for (int i = 0; i < 9; i++) {
            movements.put(new Board.Cell(9, i), new Board.Cell(9, i + 1));
        }
    }
}
