import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalTest {
    private final BotMover botMover;

    public FunctionalTest() {
        botMover = new BotMover();
    }

    @Test
    public void movementsTest() {
        for (int i = 0; i < 19; i++) {
            botMover.headToDestination();
        }
        assertEquals(new Board.Cell(9, 9), botMover.headToDestination());
    }
}
