package com.dddexplained.designbootcamp.demeter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Paperboy {
    private final Logger logger = LoggerFactory.getLogger(Paperboy.class);

    public void charge(Customer myCustomer, float payment) {
        Wallet theWallet = myCustomer.getWallet();
        if (theWallet.getTotalMoney() > payment) {
            theWallet.subtractMoney(payment);
        } else {
            logger.warn("Not enough money.");
            throw new NotEnoughMoneyException();
        }
    }
}
