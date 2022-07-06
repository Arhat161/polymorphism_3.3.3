package ru.netology;

import java.math.BigDecimal;

import ru.netology.taxes.IncomeTaxType;
import ru.netology.taxes.ProgressiveTaxType;
import ru.netology.taxes.TaxService;
import ru.netology.taxes.VATaxType;

public class Main {

    public static void main(String[] args) {
        String firstAmount = "100000.0000";
        String secondAmount = "100000.0000";
        String thirdAmount = "100000.0000";
        // новый объект налоговой службы
        TaxService taxService = new TaxService();
        // новые суммы с использованием BigDecimal
        BigDecimal firstDigit = new BigDecimal(firstAmount);
        BigDecimal secondDigit = new BigDecimal(secondAmount);
        BigDecimal thirdDigit = new BigDecimal(thirdAmount);

        // массив платежей с различными типами налогообложения
        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(firstDigit, new IncomeTaxType(), taxService),
                new Bill(secondDigit, new VATaxType(), taxService),
                new Bill(thirdDigit, new ProgressiveTaxType(), taxService),
        };
        // перебираем в цикле платежи из массива и проводим каждый платеж
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i]; // получить новый счет из массива счетов
            bill.payTaxes(); // оплата налога
        }
    }
}