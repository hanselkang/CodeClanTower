
import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;
import static rooms.RoomType.SINGLE;


public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
                bedroom = new Bedroom(001, SINGLE);
                guest = new Guest("Molly");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(001, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.SINGLE,bedroom.getRoomType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1,bedroom.getCapacity());
    }

    @Test
    public void startWithNoGuest(){
        assertEquals(0,bedroom.getGuests().size());
    }

    @Test
    public void canCheckIn(){
        bedroom.checkInGuest(guest);
        assertEquals(1,bedroom.getGuests().size());
    }
}
