package ru.netology;

import java.math.BigDecimal;
import java.math.RoundingMode;

import ru.netology.taxes.TaxService;
import ru.netology.taxes.TaxType;

class Bill {
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;


    // КОНСТРУКТОР
    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        String taxName = taxType.getTaxName(); // получить имя налога
        BigDecimal taxAmount = taxType.calculateTaxFor(amount).setScale(2, RoundingMode.HALF_UP); // вычислить налог исходя из класса
        System.out.print("Оплачиваем " + taxName + " от суммы " + amount.setScale(2, RoundingMode.HALF_UP) + " : ");
        taxService.payOut(taxAmount); // выплатить налог
    }
}
