package com.example.infrastructure.configuration.jackson;

import com.example.domain.model.ticket.Ticket;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

class TicketSerializer extends JsonSerializer<Ticket> {

    @Override
    public void serialize(Ticket ticket,
                          JsonGenerator generator,
                          SerializerProvider serializers) throws IOException {
        generator.writeStartObject();
        generator.writeObjectField("title", ticket.title().toString());
        generator.writeObjectField("price", ticket.price());
        generator.writeEndObject();
    }
}