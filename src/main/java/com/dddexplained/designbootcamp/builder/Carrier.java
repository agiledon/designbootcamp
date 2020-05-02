package com.dddexplained.designbootcamp.builder;

import java.util.Objects;

public class Carrier {
    private String airlineCode;

    public Carrier(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrier carrier = (Carrier) o;
        return Objects.equals(airlineCode, carrier.airlineCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlineCode);
    }
}
