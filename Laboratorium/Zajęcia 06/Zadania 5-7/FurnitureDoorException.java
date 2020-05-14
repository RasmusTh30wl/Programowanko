package org.example;

public class FurnitureDoorException extends FurnitureException {
    public FurnitureDoorException(){
        text="Furniture Door Exception";
    }

    @Override
    public String getMessage() {
        return text;
    }
}
