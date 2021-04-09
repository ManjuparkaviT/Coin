package utility;

public class CoinToss {
    public enum CoinFace {
        Heads(0.5), Tails(0.5);

        private final double probability;

        CoinFace(double probability) {
            this.probability = probability;
        }
    }

    CoinFace coinFace;

    public CoinToss(CoinFace coinFace) {
        this.coinFace = coinFace;
    }

    public CoinProbability getProbability() {
        return new CoinProbability(this.coinFace.probability);
    }

    public CoinProbability probabilityOfEventsOccurringTogether(CoinToss toss) {
        if(this.coinFace==toss.coinFace)
            return new CoinProbability(this.coinFace.probability * toss.coinFace.probability);
        else
            return new CoinProbability(this.coinFace.probability);
    }
}
