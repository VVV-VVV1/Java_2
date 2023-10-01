import java.lang.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        double r;
        Circle k1 = new Circle(3.1,4.1,5.1,"\u001B[31m");
        System.out.println("Длинна окружности = " + k1.getPerimetr() + "см");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлинна окружности = " + k1.getPerimetr() + "см");
    }
}
