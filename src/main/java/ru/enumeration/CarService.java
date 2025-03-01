package ru.enumeration;

public class CarService {
    public static void main(String[] args) {
        // Создаем заказ-наряд
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);

        // Используем switch для обработки статуса заказа
        switch (order.getStatus()) {
            case ACCEPTED:
                System.out.println("Статус: Автомобиль принят на СТО");
                break;
            case IN_WORK:
                System.out.println("Статус: Автомобиль в работе");
                break;
            case WAITING:
                System.out.println("Статус: Автомобиль ожидает запчасти");
                break;
            case FINISHED:
                System.out.println("Статус: Все работы завершены");
                break;
            default:
                System.out.println("Неизвестный статус");
        }
    }
}

