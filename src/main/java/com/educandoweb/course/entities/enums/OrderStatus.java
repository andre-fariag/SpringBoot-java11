package com.educandoweb.course.entities.enums;

import org.dom4j.IllegalAddException;

public enum OrderStatus {

    CANCELED(1), DELIVERED(2), SHIPPED(3), PAID(4), WAITING_PAYMENT(5);

    private int code;

    private OrderStatus(int code) { // o construtor no tipo enumerado é do tipo private
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    // metodo estatico que converte o inteiro para tipo enumerado
    // estatico -> funciona sem precisar ser estanciado
    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalAddException("Invalid order status code!");
    }
}
