import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию для Android по ссылке");
        } else {
            System.out.println("Проверьте еще раз");
        }
        //Задача 2
        int clientDeviseYear = 2015;
        int OS = 1;
        if (OS == 1 && clientDeviseYear <= 2015) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else if (OS == 0 && clientDeviseYear <= 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else if (OS == 1 && clientDeviseYear > 2015) {
            System.out.println("Установитe для iOS по ссылке");
        } else if (OS == 0 && clientDeviseYear > 2015) {
            System.out.println("Установите версию для Android по ссылке");
        } else {
            System.out.println("Проверьте еще раз");
        }
        // Задача 3
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 && year > 1584) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        //Задача 4
        int deliveryDistanse = 95;
        int days = 1;
        if (deliveryDistanse < 20) {
            System.out.println("Потребуется дней " + days);
        } else if (deliveryDistanse >= 20 && deliveryDistanse < 60) {
            System.out.println("Потребуется дней " + (days + 1));
        } else if (deliveryDistanse >= 60 && deliveryDistanse <= 100)
        {
            System.out.println("Потребуется дней " + (days + 2));
        } else {
            System.out.println("Доставки нет");}
        // Задача 5
        int monthNumder = 12;
        switch (monthNumder){
            case 1, 2 ,12:
                System.out.println("Зимний месяц");
                break;
            case 3, 4, 5:
                System.out.println("Весенний месяц");
                break;
            case 6, 7, 8:
                System.out.println("Летний месяц");
                break;
            case 9, 10, 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}
