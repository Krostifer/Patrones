public class KgLbAdapter extends EeuuBoxer {
    private ChileanBoxer chileanBoxer;

    public KgLbAdapter(ChileanBoxer chileanBoxer) {
        this.chileanBoxer = chileanBoxer;
    }

    @Override
    public double getWeight() {
        double result;
        double equivalencia = 2.2046;
        //Transformar los kg a lb
        result = chileanBoxer.getKgWeight() * equivalencia;
        return result;
    }
}