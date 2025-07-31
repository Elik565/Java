package zoo;

public class Elephant extends Animal {
    public Elephant(int user_speed) {
        super(user_speed);  // вызываем конструктор родителя
    }

    public void makeSound() {
        System.out.println("Elephant trumpets");
    }
}
