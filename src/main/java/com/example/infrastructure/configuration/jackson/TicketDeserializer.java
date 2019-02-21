package com.example.infrastructure.configuration.jackson;

import com.example.domain.model.ticket.Price;
import com.example.domain.model.ticket.Ticket;
import com.example.domain.model.ticket.Title;
import com.example.domain.type.money.Amount;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.math.BigDecimal;

class TicketDeserializer extends JsonDeserializer<Ticket> {

    @Override
    public Ticket deserialize(JsonParser parser,
                              DeserializationContext context) throws IOException {
        JsonNode node = parser.getCodec().readTree(parser);
        Title title = new Title(node.get("title").textValue());

        Amount amount = new Amount(null);
        if(node.get("price").isNumber())
            amount = new Amount(node.get("price").decimalValue());
        Price price = new Price(amount);
        return new Ticket(title, price);
    }
}