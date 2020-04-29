import java.util.Random;

public class Stock extends Security{

    public Stock(float value, int id) {
        super(value, id);
    }

    @Override
    public void step() {
        int x= new Random().nextBoolean() ? 1 : -1;
        setValue((getValue()+x*0.1f*getValue()));
    }
}
