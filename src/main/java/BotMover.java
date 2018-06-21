public class BotMover {
    private final MovementStrategy strategy;

    public BotMover() {
        this.strategy = new SecondMovementStrategy();
    }

    public Board.Cell headToDestination() {
        return strategy.moveToTopRight();
    }
}
