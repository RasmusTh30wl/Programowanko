public class Wallet {
    private Security[] arr;

    public Wallet(Security[] arr) {
        this.arr = arr;
    }

    public void step(){
        for (Security s:arr) {
            s.step();
        }
    }

    public float returnValue(){
        float value=0;
        for (Security s:arr) {
            value+=s.getValue();
        }
        return value;
    }
}
