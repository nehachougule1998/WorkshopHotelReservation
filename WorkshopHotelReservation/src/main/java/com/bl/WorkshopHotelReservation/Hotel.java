package com.bl.WorkshopHotelReservation;

public class Hotel {
	enum customer {
        REGULAR, REWARD;
    }

    String hotelName;
    int rating;
    int weekdayRate;
    int weekendRate;

    public Hotel(String hotelName, int rating, int weekdayRate, int weekendRate) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
    }

    public String getHotelName() {
        return hotelName;
    }
    
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public int getWeekdayRate() {
        return weekdayRate;
    }
    
    public void setWeekdayRate(int weekdayRate) {
        this.weekdayRate = weekdayRate;
    }
    
    public int getWeekendRate() {
        return weekendRate;
    }
    
    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }
    
}