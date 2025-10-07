package com.example.broker_service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Observer {

    // Здесь будут хранится список всех сервисов-консьюмеров,
    // теx сервисов, которые ожидают сообщение от брокера
    private final List<String> subscribedServices;

    // В списке будут храниться все сообщения от сервиса-продюсера
    private final List<String> messages;

    public Observer() {
        this.subscribedServices = new ArrayList<>(16);
        this.messages = new ArrayList<>(16);
    }

    // TODO: Функция подписки на брокер
    // TODO: Функция добавления сообщения в список
    // TODO: Функция отправки сообщения во все консюмеры
}
