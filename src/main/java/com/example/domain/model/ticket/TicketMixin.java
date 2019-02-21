package com.example.domain.model.ticket;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using= TicketSerializer.class)
@JsonDeserialize(using = TicketDeserializer.class)
public interface TicketMixin {
}