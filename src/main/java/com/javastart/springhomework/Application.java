package com.javastart.springhomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Создать приложение, которое будет создавать Account с параметрами пользователя
 * и счетом Bill
 *
 * Account будет содержать следующие поля: accountId, name, email, список Bill
 *
 * Bill будет содержать следующие поля: billId, BigDecimal amount, boolean isDefault
 *
 * Так же нужно будет уметь принимать платежи Payment и пополнение счета Deposit
 *
 * И реализовать метод перевода денег с одного Account на другой (Transfer) в отдельном контроллере
 */


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
