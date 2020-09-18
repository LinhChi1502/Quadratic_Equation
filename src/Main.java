import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agrs argu = new Agrs();
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        Double a = sc.nextDouble();

        System.out.println("Nhập số a: ");
        argu.setA(sc.nextDouble());
        System.out.println("Nhập số b: ");
        argu.setB(sc.nextDouble());
        System.out.println("Nhập số c: ");
        argu.setC(sc.nextDouble());
        double delta = argu.getDiscriminant();
        if (delta > 0) {
            System.out.println("PT có 2 nghiệm " + argu.getRoot1() + " và " + argu.getRoot2());
        } else if (delta == 0) {
            System.out.println("PT có 1 nghiệm " + argu.getRoot1());
        } else {
            System.out.println("PT vô nghiệm");
        }
    }
}
