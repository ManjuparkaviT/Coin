package utility;

public class CoinToss {
    public enum coinFace {
        Heads(0.5), Tails(0.5);

        private final double probability;

        coinFace(double probability) {
            this.probability = probability;
        }
    }

    coinFace coinSide;

    public CoinToss(coinFace coinSide) {
        this.coinSide=coinSide;
    }

    public CoinProbability getProbability() {
        return new CoinProbability(this.coinSide.probability);
    }

    public CoinProbability getJointProbability(CoinToss toss) {
        return new CoinProbability(this.coinSide.probability * toss.coinSide.probability);
    }
}
