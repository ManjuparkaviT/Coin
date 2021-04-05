package utility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTest {

    @Test
    public void testIfProbabilityOfHeadsAndTailsInACoinTossAreEqual(){
        Coin coin = new Coin();
        double headProbability=0.5;
        double tailProbability=0.5;

        boolean actualValue=coin.isEqual(headProbability,tailProbability);

        assertTrue(actualValue);
    }
}
