public class Debenture extends Security{
    private float interest;

    public Debenture(float value, int id, float interest) {
        super(value, id);
        this.interest=interest;
    }

    @Override
    public void step() {
        setValue(getValue()+interest*0.01f*getValue());
    }
}
