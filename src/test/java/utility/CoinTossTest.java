package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTossTest {

    @Test
    public void testIfProbabilityOfHeadsAndTailsInACoinTossAreEqual(){
        CoinToss headToss = new CoinToss(CoinToss.CoinFace.Heads);
        CoinToss tailToss = new CoinToss(CoinToss.CoinFace.Tails);

        CoinProbability headProbability=headToss.getProbability();
        CoinProbability tailProbability=tailToss.getProbability();

        assertEquals(headProbability,tailProbability);
    }

    @Test
    public void testIfProbabilityIsOneFourthForEventOfHeadAndHeadTossOccurringTogether(){
        CoinToss firstHeadToss = new CoinToss(CoinToss.CoinFace.Heads);
        CoinToss secondHeadToss = new CoinToss(CoinToss.CoinFace.Heads);
        CoinProbability expectedProbability=new CoinProbability(0.25);

        CoinProbability actualProbability=firstHeadToss.probabilityOfEventsOccurringTogether(secondHeadToss);

        assertEquals(expectedProbability,actualProbability);
    }

    @Test
    public void testIfProbabilityIsHalfForEventOfHeadAndTailTossOccurringTogether(){
        CoinToss headToss = new CoinToss(CoinToss.CoinFace.Heads);
        CoinToss tailToss = new CoinToss(CoinToss.CoinFace.Tails);
        CoinProbability expectedProbability=new CoinProbability(0.5);

        CoinProbability actualProbability=headToss.probabilityOfEventsOccurringTogether(tailToss);

        assertEquals(expectedProbability,actualProbability);
    }

    @Test
    public void testIfProbabilityOfTailTossWhichIsNotOccurringIsHalf(){
        CoinToss headToss = new CoinToss(CoinToss.CoinFace.Heads);
        CoinProbability expectedProbability=new CoinProbability(0.5);

        CoinProbability actualProbability=headToss.probabilityOfAnEventNotOccurring();

        assertEquals(expectedProbability,actualProbability);
    }
}
