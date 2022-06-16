package hotels;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import rooms.*;
import guests.Guest;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom>bedrooms;
    private ArrayList<ConferenceRoom>conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }



    public void addBedroom(int roomNumber, RoomType roomType){
        Bedroom newBedroom = new Bedroom(roomNumber, roomType);
        bedrooms.add(newBedroom);
    }

    public void addConferenceRoom(int capacity, String name){
        ConferenceRoom newConferenceRoom = new ConferenceRoom(capacity,name);
        conferenceRooms.add(newConferenceRoom);
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }



    public Bedroom getBedroomByNumber(int roomNumber) {

        Bedroom result = null;
        for (Bedroom bedroom:bedrooms){
            if ( bedroom.getRoomNumber() == roomNumber ){
                result = bedroom;
            }
        }
        return result;
    }

    public ConferenceRoom getConferenceRoomByName(String roomName) {

        ConferenceRoom result = null;
        for (ConferenceRoom conferenceRoom:conferenceRooms){
            if ( conferenceRoom.getName() == roomName ){
                result = conferenceRoom;
            }
        }
        return result;
    }

    public void bedroomCheckIn(String guestName, int roomNumber) {
        Guest guest = new Guest(guestName);
        Bedroom bedroom = getBedroomByNumber(roomNumber);
        bedroom.checkInGuest(guest);
    }
}
