package org.example;

public class OversizedDoorException extends Exception {
    double widthDiff, heightDiff;
    String result;

    public OversizedDoorException(double widthDiff, double heightDiff){
        result="Diff in width: "+Double.toString(widthDiff)+", diff in height: "+Double.toString(heightDiff);
    }
    public String getMessage(){
        return result;
    }

}
