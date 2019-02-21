package com.example.domain.type.money;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

class AmountSerializer extends JsonSerializer<Amount> {

    @Override
    public void serialize(Amount amount,
                          JsonGenerator generator,
                          SerializerProvider serializers) throws IOException {
        generator.writeObject(amount.value);
    }
}