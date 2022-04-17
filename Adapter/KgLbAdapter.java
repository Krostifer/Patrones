public class KgLbAdapter extends EeuuBoxer {
    private ChileanBoxer kgWeight;

    public KgLbAdapter(ChileanBoxer kgWeight) {
        this.kgWeight = kgWeight;
    }

    @Override
    public double getWeight() {
        double result;
        double equivalencia = 2.2046;
        //Transformar los kg a lb
        result = kgWeight.getKgWeight() * equivalencia;
        return result;
    }
}