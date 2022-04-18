public class WeightChecker {

    private double weightLimit;

    public WeightChecker(double weightLimit){
        this.weightLimit = weightLimit;
    }

    public double getWeightLimit(){
        return weightLimit;
    }

    public boolean accepted(EeuuBoxer lbWeight){
        boolean result;
        result = (lbWeight.getWeight() <= this.getWeightLimit());
        return result;
    }
}