package com.example.infrastructure.configuration.jackson;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using= TicketSerializer.class)
@JsonDeserialize(using = TicketDeserializer.class)
public interface TicketMixin {
}