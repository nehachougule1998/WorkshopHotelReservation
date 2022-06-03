package com.bl.WorkshopHotelReservation;

import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystem {
    Map<String, Hotel> hotelReservation = new HashMap<>();

    public void addHotel() {
        Hotel obj1 = new Hotel("Lakewood", 3, 110, 90);
        Hotel obj2 = new Hotel("Bridgewood", 4, 160,60);
        Hotel obj3 = new Hotel("Ridgewood", 5, 220, 150);
        hotelReservation.put(obj1.getHotelName(), obj1);
        hotelReservation.put(obj2.getHotelName(), obj2);
        hotelReservation.put(obj3.getHotelName(), obj3);
    }
    
    public static void main(String[] args) {
    	System.out.println("Welcome to the Hotel Reservation System");
        HotelReservationSystem hotel = new HotelReservationSystem();
        hotel.addHotel();

    }
}
