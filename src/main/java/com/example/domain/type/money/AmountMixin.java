package com.example.domain.type.money;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = AmountSerializer.class)
public interface AmountMixin {
}