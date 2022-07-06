package ru.netology.taxes;

import java.math.BigDecimal;

// НАЛОГОВАЯ СЛУЖБА
public class TaxService {
    // УПЛАТА НАЛОГА
    public void payOut(BigDecimal taxAmount) {
        System.out.println("Уплачен налог в размере " + taxAmount);
    }
}
