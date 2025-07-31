package pkg1;

public class Main1 {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        pc.print();

        PackagePrivateClass ppc = new PackagePrivateClass();
        ppc.print();
    }
}
