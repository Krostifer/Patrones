public class EeuuBoxer {
    private String name;
    private double lbWeight;

    public EeuuBoxer() {}

    public EeuuBoxer(String name, double weight) {
        this.name = name;
        this.lbWeight = weight;
    }

    public double getWeight() {
        return lbWeight;
    }

    public String getEeuuBoxerName() {
        return name;
    }
}
