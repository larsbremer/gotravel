package com.larsbremer.gotravel.db;

import java.util.List;

import com.larsbremer.gotravel.model.Accomodation;
import com.larsbremer.gotravel.model.Flight;
import com.larsbremer.gotravel.model.Trip;

public interface DBController {

	List<Trip> searchTrips(Trip filter, Integer offset, Integer size);

	Trip searchTrip(Trip filter);

	void createTrip(Trip trip);

	List<Flight> searchFlights(Flight flightFilter, Integer offset, Integer size);

	List<Accomodation> searchAccomodations(Accomodation accomodationFilter, Integer offset, Integer size);

}
