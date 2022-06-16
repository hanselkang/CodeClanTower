import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
     conferenceRoom = new ConferenceRoom(90,"HanselConf");
            guest = new Guest("Molly");
    }
    @Test
    public void canGetCapacity(){
     assertEquals(90,conferenceRoom.getCapacity());}

    @Test
    public void canGetName(){
        assertEquals("HanselConf",conferenceRoom.getName());
    }

    @Test
    public void startWithNoGuest(){
        assertEquals(0,conferenceRoom.getGuests().size());
    }

    @Test
    public void canCheckIn(){
        conferenceRoom.checkInGuest(guest);
        assertEquals(1,conferenceRoom.getGuests().size());
    }
}
