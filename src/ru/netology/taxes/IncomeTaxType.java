package ru.netology.taxes;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {

    private final double PERCENT = 0.13;

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal res = amount.multiply(BigDecimal.valueOf(PERCENT));
        return res;
    }

    @Override
    public String getTaxName() {
        return "Подоходный налог, 13%";
    }

}
