package zoo;

public class Lion extends Animal {
    public Lion(int user_speed) {
        super(user_speed);  // вызываем конструктор родителя
    }

    public void makeSound() {
        System.out.println("Lion roars");
    }
}
