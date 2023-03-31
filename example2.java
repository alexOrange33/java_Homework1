package Jjava_Homework;
import java.util.Scanner;
public class example2 
{
    public static void main(String[] args)
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        System.out.println(factor(n));
     } 
     static int factor(int k) 
     {
       if (k == 1) return 1;
        return k*factor(k-1);
     
    }
}
