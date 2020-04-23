package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Room[] rooms = {new Room(5, 5, 5, 1, 1),
                    new Room(5, 6, 6, 2, 2),
                    new Room(5, 6, 7, 1, 2),
                    new Room(5, 4, 5, 2, 1)};

            House h = new House(rooms);
            h.at(1);
            for(int i=0;i<4;i++)
                System.out.println(rooms[0].setFurniture(5,2,2));



        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
