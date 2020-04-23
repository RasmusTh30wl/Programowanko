package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Room {
    private double room_length, room_width, room_height;
    private double door_width, door_height;
    private double freeSpace;

    public Room(double room_length,double room_width,double room_height,
                double door_width,double door_height) throws OversizedDoorException {

        this.door_height=door_height;
        this.door_width=door_width;
        this.room_height=room_height;
        this.room_length=room_length;
        this.room_width=room_width;
        this.freeSpace=room_length*room_width;
        if(room_height<=0 || room_width<=0 || room_length <=0 || door_height<=0|| door_width<=0)
            throw new IllegalArgumentException("Dimensions must be positive!");
        if(door_height>room_height || door_width>room_width)
            throw  new OversizedDoorException(room_width-door_width,room_height-door_height);
    }

    boolean setFurniture(double length, double width, double height) throws FurnitureDoorException, FurnitureRoomException {
        double area=length*width;
        if(area>freeSpace)
            return false;
        double arr[]={length, width, height};

        Arrays.sort(arr);
        double min,max;
        if(door_height <door_width){
            min=door_height;
            max=door_width;
        }
        else{
            min=door_width;
            max=door_height;
        }


        if(arr[0]>min || arr[1]>max)
            throw new FurnitureDoorException();

        double min1, max1;

        if(room_length <room_width){
            min1=room_length;
            max1=room_width;
        }
        else{
            min1=room_width;
            max1=room_length;
        }
        double min2, max2;
        if(length <width){
            min2=length;
            max2=width;
        }
        else{
            min2=width;
            max2=length;
        }

        if(room_height <height || min1< min2|| max1 <max2) {
            throw new FurnitureRoomException();
        }

        freeSpace-=area;
        return true;

    }

}
