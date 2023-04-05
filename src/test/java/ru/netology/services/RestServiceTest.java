package ru.netology.services;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RestServiceTest {

    @Test
    void shouldCalculateRestMonth() {
        RestService service = new RestService();

        // подготавливаем данные:
        int income = 10_000; //ежемесячный доход
        int expenses = 3000; //ежемесячные траты
        int threshold = 20_000; // сумма при которой можно отдохнуть
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income,expenses,threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRestMontAgain() {
        RestService service = new RestService();

        // подготавливаем данные:
        int income = 100_000; //ежемесячный доход
        int expenses = 60_000; //ежемесячные траты
        int threshold = 150_000; // сумма при которой можно отдохнуть
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }




}