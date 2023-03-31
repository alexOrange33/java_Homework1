package Jjava_Homework;
import java.util.Scanner;
public class example4 {
    public static void main(String[] args) 
    {
        float num1 = calcInt();
        float num2 = calcInt();
        char operation = calcOperation();
        float res = -1;
        switch (operation)
        {
            case '+':
                res = num1+num2;
                break;
            case '-':
                res = num1-num2;
                break;
            case '*':
                res = num1*num2;
                break;
            case '/':
                res = num1/num2;
                break;
        }
        System.out.println(res);
        
    }
    public static float calcInt()
        {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите число:");
            float num;
            if(iScanner.hasNextFloat())
            {
                num = iScanner.nextFloat();
            } else {
                System.out.println("Ошибка ввода, введите число: ");
                iScanner.next();
                num = calcInt();
            }
            return num;
        }
        
        public static char calcOperation()
        {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите операцию:");
            char operation;
            if(iScanner.hasNext()){
                operation = iScanner.next().charAt(0);
            } else {
                System.out.println("Ошибка ввода, введите символ операции: ");
                iScanner.next();
                operation = calcOperation();
            }
            if(operation != '+' & operation != '-' & operation != '*' & operation != '/' )
            {
                System.out.println("Ошибка ввода");
                //iScanner.next();
                operation = calcOperation();
            }
            return operation;
        }
    }
