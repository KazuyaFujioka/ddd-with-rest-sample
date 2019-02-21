package com.example.domain.model.ticket;

import com.example.domain.type.money.Amount;

import javax.validation.Valid;

/**
 * チケット代金
 */
public class Price {

    @Valid
    Amount amount;

    public Price(Amount amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return amount.toString();
    }

    private Price() {
    }
}