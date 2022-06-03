package com.bl.WorkshopHotelReservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void givenHotelNamesWhenAddedShouldReturnSize() {
		HotelReservationSystem obj = new HotelReservationSystem();
		obj.addHotel();
		Assert.assertEquals(3,obj.hotelReservation.size());
	}
}
