package ru.netology.services;

public class Main {

        public static void main(String[] args) {
            RestService service = new RestService();

            int income = 100_000; //ежемесячный доход
            int expenses = 60_000; //ежемесячные траты
            int threshold = 150_000; // сумма при которой можно отдохнуть


            int count = service.calculate(income,expenses,threshold);

            System.out.println( "количество месяцев отдыха равно " + count);
    }
    }


