package com.example.domain.model.ticket;

import com.example.domain.type.money.Amount;

import javax.validation.Valid;

/**
 * チケット
 */
public class Ticket {

    @Valid
    Title title;

    @Valid
    Price price;

    public Ticket(Title title, Price price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "title=" + title +
                ", price=" + price +
                '}';
    }

    private Ticket() {
    }

    public Title title() {
        return title;
    }

    public Amount price() {
        return price.amount;
    }
}