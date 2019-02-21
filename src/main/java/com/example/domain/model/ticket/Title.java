package com.example.domain.model.ticket;

import javax.validation.constraints.NotEmpty;

/**
 * チケットタイトル
 */
public class Title {

    @NotEmpty(message = "チケットタイトルを指定して下さい")
    String value;

    public Title(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private Title() {
    }
}