package org.example;

public class FurnitureRoomException extends FurnitureException {
    public FurnitureRoomException(){
        text="Furniture Room Exception";
    }

    @Override
    public String getMessage() {
        return text;
    }
}
