package chapter09_inheritance;

public class WeddingCake extends Cake {

    private int tiers;

    public WeddingCake() {
        super("Caramel");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}