package com.dddexplained.designbootcamp.builder.flight;

import com.dddexplained.designbootcamp.builder.Carrier;
import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class FlightTest {
    @Test
    public void should_build_flight() {
        Flight flight = Flight.withFlightNo("2310")
                .beCarriedBy("CA")
                .departFrom("CAN")
                .arriveAt("PEK")
                .boardingOn("12")
                .flyingIn(LocalDate.now());

        assertThat(flight.getCarrier()).isEqualTo(new Carrier("CA"));
    }
}