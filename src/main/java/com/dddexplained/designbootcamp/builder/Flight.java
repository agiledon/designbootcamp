package com.dddexplained.designbootcamp.builder;

import java.time.LocalDate;

public class Flight {
    private String flightNo;
    private Carrier carrier;
    private AirportCode departureAirport;
    private AirportCode arrivalAirport;
    private Gate boardingGate;
    private LocalDate flightDate;

    public Flight(String flightNo, Carrier carrier, AirportCode departureAirport, AirportCode arrivalAirport, Gate boardingGate, LocalDate flightDate) {
        this.flightNo = flightNo;
        this.carrier = carrier;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.boardingGate = boardingGate;
        this.flightDate = flightDate;
    }
}
