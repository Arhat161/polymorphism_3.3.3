package ru.netology.taxes;

import java.math.BigDecimal;

public class VATaxType extends TaxType {

    private final double PERCENT = 0.18;

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal res = amount.multiply(BigDecimal.valueOf(PERCENT));
        return res;
    }

    @Override
    public String getTaxName() {
        return "НДС, 18%";
    }
}
