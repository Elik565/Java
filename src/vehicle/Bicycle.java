package vehicle;

// Наследуем от Vehicle, но не от Electric
public class Bicycle extends Vehicle {
    // Конструктор должен быть видимым
    public Bicycle(int speed) {
        super(speed);
    }

    public void getType() {
        System.out.println("It's a bicycle");
    }
}
