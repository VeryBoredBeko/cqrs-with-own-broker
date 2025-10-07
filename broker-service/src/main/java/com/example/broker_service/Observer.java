package com.example.broker_service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Observer {

    // Здесь будут хранится список всех сервисов-консьюмеров,
    // теx сервисов, которые ожидают сообщение от брокера
    private final List<String> subscribedServices;

    public Observer() {
        this.subscribedServices = new ArrayList<>(16);
    }
}
