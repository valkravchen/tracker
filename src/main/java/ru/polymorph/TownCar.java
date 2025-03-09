package ru.polymorph;

public class TownCar implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Коробка передач — автомат. Поставить селектор в режим D.");
    }

    @Override
    public void brake() {
        System.out.println("Нажатие на педаль газа механически открывает дроссельную заслонку.");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление.");
    }

    @Override
    public void changeGear() {
        System.out.println("Стандартная тормозная система.");
    }
}

