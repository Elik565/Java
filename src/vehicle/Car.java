package vehicle;

public class Car extends Vehicle implements Electric{
    // Конструктор должен быть видимым
    public Car(int speed) {
        super(speed);
    }

    public void getType() {
        System.out.println("It's a car");
    }

    public void charge() {
        System.out.println("Car can charge");
    }
}
