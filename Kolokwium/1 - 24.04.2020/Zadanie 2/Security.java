public abstract class Security {
    private float value;
    private int id;

    public Security(float value, int id) {
        this.value = value;
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public abstract void step();
}
