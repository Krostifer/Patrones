public class ChileanBoxer {
    private String name;
    private double kgWeight;

    public ChileanBoxer(String name, double weight) {
        this.name = name;
        this.kgWeight = weight;
    }

    public double getKgWeight() {
        return kgWeight;
    }

    public String getChileanBoxerName(){
        return name;
    }
}