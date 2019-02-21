package com.example.domain.type.money;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * 金額
 */
public class Amount {

    @NotNull(message = "金額を指定して下さい")
    @Min(value = 0, message = "{value}円以下は指定できません")
    @Max(value = 100000, message = "{value}円以上は指定できません")
    BigDecimal value;

    public Amount(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        return format.format(value);
    }

    private Amount() {
    }
}