package org.example;



public class House {
    private Room[] rooms;
    public House(Room[] rooms){
        this.rooms=rooms;
    }
    public Room at(int i){
        if(i<0 || i>=rooms.length)
            throw new IndexOutOfBoundsException("Index out of range");
        return rooms[i];

    }
}
