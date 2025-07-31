package pkg2;

import vehicle.*;  // импортируем все из пакета (аналог namespace)

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car(100);
        car.getType();
        car.move();
        car.charge();
        //System.out.println(car.speed);  Ошибка, т.к. protected

        Bicycle bike = new Bicycle(30);
        bike.getType();
        bike.move();
    }
}