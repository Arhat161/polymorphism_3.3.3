package ru.netology.taxes;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal res = amount.valueOf(0.0);

        if(amount.doubleValue() > 100000) {
            res = amount.multiply(BigDecimal.valueOf(0.15));
        } else if (amount.doubleValue() > 0 && amount.doubleValue() <= 100000) {
            res = amount.multiply(BigDecimal.valueOf(0.1));
        }
        return res;
    }

    @Override
    public String getTaxName() {
        return "Прогрессивный налог ( до 100 тысяч = 10%, больше 100 тысяч = 15% )";
    }
}
