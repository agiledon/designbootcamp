package com.dddexplained.designbootcamp.demeter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PaperboyTest {
    @Test
    public void should_pay() {
        Paperboy paperboy = new Paperboy();
        Wallet wallet = new Wallet(1000f);
        Customer customer = new Customer("bruce", "zhang", wallet);
        paperboy.charge(customer, 100f);

        assertThat(wallet.getTotalMoney()).isEqualTo(900f);
    }
}