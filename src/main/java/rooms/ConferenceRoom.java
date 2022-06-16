package rooms;

import guests.Guest;
import rooms.Room;

import java.util.ArrayList;

public class ConferenceRoom extends Room {
    public ConferenceRoom(int capacity, String name) {
        super(capacity);
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }


}
