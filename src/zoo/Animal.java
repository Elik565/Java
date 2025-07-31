package zoo;

public abstract class Animal {
    protected int speed;

    // Конструктор
    Animal(int user_speed) {
        this.speed = user_speed;
    }

    public void move() {
        System.out.println(getClass().getSimpleName() + " moves at speed " + speed);
    }

    public abstract void makeSound();  // потомок обязан реализовать
}
