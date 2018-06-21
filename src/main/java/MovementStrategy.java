import java.util.HashMap;
import java.util.Map;

public abstract class MovementStrategy {
    protected final CrawlingBot crawlingBot;
    protected final Map<Board.Cell, Board.Cell> movements;

    public MovementStrategy() {
        this.crawlingBot = new CrawlingBot(new Board(10, 10));
        this.movements = new HashMap<Board.Cell, Board.Cell>();
        movements.put(new Board.Cell(9, 9), new Board.Cell(9, 9));
        setMoves();
    }

    protected abstract void setMoves();

    public Board.Cell moveToTopRight() {
        crawlingBot.move(movements.get(crawlingBot.getCurrentPosition()));
        return crawlingBot.getCurrentPosition();
    }
}
