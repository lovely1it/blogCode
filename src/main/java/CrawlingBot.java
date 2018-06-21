public class CrawlingBot {
    private final Board board;
    private Board.Cell currentCell;

    public CrawlingBot(final Board board) {
        this.board = board;
        currentCell = new Board.Cell(0, 0);
    }

    public void move(final Board.Cell target) {
        if (board.isWithinLimits(target)) {
            System.out.println("MOVING FROM " + currentCell + " TO " + target);
            currentCell = target;
        } else {
            throw new IllegalArgumentException("Illegal move!");
        }
    }

    public Board.Cell getCurrentPosition() {
        return currentCell;
    }
}
