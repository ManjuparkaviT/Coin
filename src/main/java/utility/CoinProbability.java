package utility;

import java.util.Objects;

public class CoinProbability {
    double probability;

    public CoinProbability(double probability) {
        this.probability=probability;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CoinProbability tossProbability = (CoinProbability) obj;
        return Double.compare(tossProbability.probability, probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(probability);
    }
}
