package com.example;

import com.example.domain.model.ticket.Ticket;
import com.example.domain.model.ticket.TicketFactory;
import com.example.infrastructure.configuration.jackson.CustomObjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JacksonSampleTest {

    static Logger LOG = LoggerFactory.getLogger(JacksonSampleTest.class);

    public static void main(String[] args) throws Exception {
        Ticket ticket = TicketFactory.create();

        // model to json
        ObjectMapper objectMapper = CustomObjectMapper.objectMapper();
        String json = objectMapper.writeValueAsString(ticket);
        LOG.info("ticket to json=" + json);

        // json to model
        ticket = objectMapper.readValue(json, Ticket.class);
        LOG.info("json to ticket=" + ticket);
    }
}