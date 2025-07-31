package pkg1;

// В интерфейсе все методы по умолчанию public
interface A {
    void SayHello();
}

interface B {
    void SayGoodbye();
}

// Объявляем, что класс C должен реализовать все методы из интерфейсов A и B
class C implements A, B {  
    public void SayHello() {
        System.out.println("Hello");
    }

    public void SayGoodbye() {
        System.out.println("Goodbye");
    }
}

public class Main1 {
    public static void main(String[] args) {
        C obj = new C();
        obj.SayHello();
        obj.SayGoodbye();
    }
}
