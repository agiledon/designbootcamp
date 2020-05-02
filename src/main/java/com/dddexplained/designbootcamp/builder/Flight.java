package com.dddexplained.designbootcamp.builder;

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

    public static Builder prepareBuilder(String flightNo) {
        return new Builder(flightNo);
    }

    public static class Builder {
        // required fields
        private final String flightNo;

        // optional fields
        private Carrier carrier;
        private Airport departureAirport;
        private Airport arrivalAirport;
        private Gate boardingGate;
        private LocalDate flightDate;

        public Builder(String flightNo) {
            this.flightNo = flightNo;
        }
        public Builder beCarriedBy(String airlineCode) {
            carrier = new Carrier(airlineCode);
            return this;
        }
        public Builder departFrom(String airportCode) {
            departureAirport = new Airport(airportCode);
            return this;
        }
        public Builder arriveAt(String airportCode) {
            arrivalAirport = new Airport(airportCode);
            return this;
        }
        public Builder boardingOn(String gateNo) {
            boardingGate = new Gate(gateNo);
            return this;
        }
        public Builder flyingIn(LocalDate flyingInDate) {
            flightDate = flyingInDate;
            return this;
        }
        public Flight build() {
            return new Flight(this);
        }
    }
    private Flight(Builder builder) {
        flightNo = builder.flightNo;
        carrier = builder.carrier;
        departureAirport = builder.departureAirport;
        arrivalAirport = builder.arrivalAirport;
        boardingGate = builder.boardingGate;
        flightDate = builder.flightDate;
    }
}
