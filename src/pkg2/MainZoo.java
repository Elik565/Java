package pkg2;

import zoo.*;

public class MainZoo {
    public static void main(String[] args) {
        // Полиморфизм - все объекты хранятся в массиве, но ведут себя по разному
        Animal[] animals = {
            new Lion(70),
            new Elephant(25)
        };

        // Динамический полиморфизм - метод makeSound() вызывается в зависимости от класса через 
        // ссылку на родителя в момент выполнения программы
        for (Animal a : animals) {
            a.move();
            a.makeSound();
            System.out.println();
        }
    }
}
