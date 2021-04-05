package utility;

public class Coin {

    public enum coinFace{
        Heads,Tails;
    }

    public double getProbability(Coin.coinFace coinFace){
        return 0.5;
    }

    public boolean checkIfProbabilitiesAreEqual(double headProbability, double tailProbability) {
        return headProbability==tailProbability;
    }
}
