package rooms;

import guests.Guest;

import java.sql.Array;
import java.util.ArrayList;

public abstract class Room {


private int capacity;
private ArrayList<Guest> guests;



    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }


    public void checkInGuest(Guest guest){
        guests.add(guest);
    }
}
