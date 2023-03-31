package Jjava_Homework;
import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        double res = 0.5*n*(n+1);
        System.out.println(res);
    }
}
