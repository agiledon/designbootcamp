package com.dddexplained.designbootcamp.builder.flight;

import com.dddexplained.designbootcamp.builder.Airport;
import com.dddexplained.designbootcamp.builder.Carrier;
import com.dddexplained.designbootcamp.builder.Gate;

import java.time.LocalDate;

public class Flight {
    private String flightNo;
    private Carrier carrier;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Gate boardingGate;
    private LocalDate flightDate;

    public String getFlightNo() {
        return flightNo;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public Gate getBoardingGate() {
        return boardingGate;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    private Flight(String flightNo) {
        this.flightNo = flightNo;
    }

    public static Flight withFlightNo(String flightNo) {
        return new Flight(flightNo);
    }

    public Flight beCarriedBy(String airlineCode) {
        this.carrier = new Carrier(airlineCode);
        return this;
    }

    public Flight departFrom(String airportCode) {
        this.departureAirport = new Airport(airportCode);
        return this;
    }

    public Flight arriveAt(String airportCode) {
        this.arrivalAirport = new Airport(airportCode);
        return this;
    }

    public Flight boardingOn(String gate) {
        this.boardingGate = new Gate(gate);
        return this;
    }

    public Flight flyingIn(LocalDate flightDate) {
        this.flightDate = flightDate;
        return this;
    }
}
