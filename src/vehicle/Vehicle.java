package vehicle;

abstract class Vehicle {
    protected int speed;  // только потомки и классы из этого же пакета могут использовать это поле

    // Конструктор. Теперь каждый потомок должен вызвать super
    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Moving at speed = " + speed);
    }

    // Чтобы не задавать реализацию, делаем abstract. По умолчанию package-private
    public abstract void getType(); 
}

interface Electric {
    void charge();  // public по умолчанию
}
