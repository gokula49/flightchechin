package com.gokul.flightcheckin.integration;

import com.gokul.flightcheckin.integration.dto.Reservation;
import com.gokul.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
    
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
