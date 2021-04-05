package utility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTest {

    @Test
    public void testIfProbabilityOfHeadsAndTailsInACoinTossAreEqual(){
        Coin coin = new Coin();
        double headProbability=coin.getProbability(Coin.coinFace.Heads);
        double tailProbability=coin.getProbability(Coin.coinFace.Tails);

        boolean actualValue=coin.checkIfProbabilitiesAreEqual(headProbability,tailProbability);

        assertTrue(actualValue);
    }
}
