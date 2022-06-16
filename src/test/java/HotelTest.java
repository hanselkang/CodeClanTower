import hotels.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static rooms.RoomType.DOUBLE;
import static rooms.RoomType.SINGLE;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom001;
    private Bedroom bedroom002;
    private ConferenceRoom conference001;

    @Before
    public void before(){
        bedroom001 = new Bedroom(001,SINGLE);
        bedroom002 = new Bedroom(002,DOUBLE);
        conference001 = new ConferenceRoom(90,"Hansel");

        ArrayList<Bedroom> bedroomList = new ArrayList<>();
            bedroomList.add(bedroom001);
            bedroomList.add(bedroom002);
        ArrayList<ConferenceRoom> conferenceList = new ArrayList<>();
            conferenceList.add(conference001);

        hotel = new Hotel( bedroomList ,conferenceList );
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(003,SINGLE);
        assertEquals(3,hotel.getBedrooms().size());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(900,"VAL");
        assertEquals(2,hotel.getConferenceRooms().size());
    }

    @Test
    public void canGetBedroomByNumber(){
        assertEquals(bedroom002,hotel.getBedroomByNumber(002));
    }

    @Test
    public void canGetConferenceRoomByName(){
        assertEquals(conference001,hotel.getConferenceRoomByName("Hansel"));
    }
    @Test
    public void checkInGuest(){
        hotel.bedroomCheckIn("Elin",002);
        assertEquals(1,bedroom002.getGuests().size());
    }
}
