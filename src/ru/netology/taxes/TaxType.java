package ru.netology.taxes;

import java.math.BigDecimal;

public class TaxType {

    public BigDecimal calculateTaxFor(BigDecimal amount) {
        // TODO override me!
        return BigDecimal.valueOf(0.0);
    }

    public String getTaxName() {
        // TODO override me!
        return "";
    }
}