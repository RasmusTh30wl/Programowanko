package pl.umcs;

public class SumatorMethod implements GenericMethod<Integer>{

    @Override
    public Integer function(Integer a, Integer b) {
        return a+b;
    }

}
