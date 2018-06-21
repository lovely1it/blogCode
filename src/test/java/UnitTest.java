import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A unit test as described in the blog. Set the botMover to FirstMovementStrategy for these tests to pass.
 */
public class UnitTest {
    private BotMover botMover;

    public UnitTest() {
        botMover = new BotMover();
    }

    @Test
    public void movementsTest() {
        for (int i = 0; i < 9; i++) {
            Board.Cell currentPosition = botMover.headToDestination();
            assertEquals(new Board.Cell(0, i + 1), currentPosition);
        }
        for (int i = 0; i < 9; i++) {
            Board.Cell currentPosition = botMover.headToDestination();
            assertEquals(new Board.Cell(i + 1, 9), currentPosition);
        }
    }
}
