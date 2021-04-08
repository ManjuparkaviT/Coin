package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossTest {

    @Test
    public void testIfProbabilityOfHeadsAndTailsInACoinTossAreEqual(){
        CoinToss headToss = new CoinToss(CoinToss.coinFace.Heads);
        CoinToss tailToss = new CoinToss(CoinToss.coinFace.Tails);

        CoinProbability headProbability=headToss.getProbability();
        CoinProbability tailProbability=tailToss.getProbability();

        assertEquals(headProbability,tailProbability);
    }

    @Test
    public void testIfProbabilityIsOneFourthForJointProbabilityOfHeadAndTailToss(){
        CoinToss headToss = new CoinToss(CoinToss.coinFace.Heads);
        CoinToss tailToss = new CoinToss(CoinToss.coinFace.Tails);
        CoinProbability expectedProbability=new CoinProbability(0.25);

        CoinProbability actualProbability=headToss.getJointProbability(tailToss);

        assertEquals(expectedProbability,actualProbability);
    }
}
