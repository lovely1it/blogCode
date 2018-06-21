public class FirstMovementStrategy extends MovementStrategy {
    @Override
    public void setMoves() {
        for (int i = 0; i < 9; i++) {
            movements.put(new Board.Cell(0, i), new Board.Cell(0, i + 1));
        }
        for (int i = 0; i < 9; i++) {
            movements.put(new Board.Cell(i, 9), new Board.Cell(i + 1, 9));
        }
    }
}
