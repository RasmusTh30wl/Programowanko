package pl.umcs;

public class MaxMethod implements GenericMethod<Integer>{

    @Override
    public Integer function(Integer a, Integer b) {
        return a > b ? a : b;
    }

}
