package com.dddexplained.designbootcamp.demeter;

import org.junit.Test;

public class PaperboyTest {
    @Test
    public void should_pay() {
        Paperboy paperboy = new Paperboy();
        paperboy.charge(null, 100f);
    }
}