package com.example.domain.model.ticket;

import com.example.domain.type.money.Amount;

import java.math.BigDecimal;

public class TicketFactory {

    public static Ticket create() {
        Title title = new Title("ライプツィヒ・ゲヴァントハウス管弦楽団 S席");
        Price price = new Price(new Amount(BigDecimal.valueOf(32000)));
        return new Ticket(title, price);
    }
}