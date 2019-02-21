package com.example.infrastructure.configuration.jackson;

import com.example.domain.model.ticket.Ticket;

import com.example.domain.model.ticket.TicketMixin;
import com.example.domain.type.money.Amount;
import com.example.domain.type.money.AmountMixin;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomObjectMapper {

    public static ObjectMapper objectMapper() {
        return SingletonHolder.INSTANCE.objectMapper;
    }

    private static class SingletonHolder {
        private static final CustomObjectMapper INSTANCE = new CustomObjectMapper();
    }

    ObjectMapper objectMapper;

    private CustomObjectMapper() {
        this.objectMapper = new ObjectMapper();
        // Direct Field Access use, getter setter ignore
        this.objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.NON_PRIVATE);
        this.objectMapper.setVisibility(PropertyAccessor.GETTER,JsonAutoDetect.Visibility.NONE);
        this.objectMapper.setVisibility(PropertyAccessor.SETTER,JsonAutoDetect.Visibility.NONE);

        this.objectMapper.addMixIn(Amount.class, AmountMixin.class);
        this.objectMapper.addMixIn(Ticket.class, TicketMixin.class);
    }
}