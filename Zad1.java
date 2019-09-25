package Zad1; 
import java.util.Scanner;

public class Zad1 {
    
    
    public static void main(String[] args) {
        boolean num = true;
        int b; 
        try {
        System.out.print("Введите целое число ");
        
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        
         if (n % 2 == 0) {
                System.out.println ("Число " + n + " четное");
            } else {
                System.out.println ("Число " + n + " нечетное");
            } 
           
        
        for (int i=2; i <= n/2; i++ ) {
           b = n % i; 
           if (b == 0) { 
               num = false;
               break;} 
        }
        if (num) {
            System.out.println( "Число " + n + " простое");
        } else {
            System.out.println( "Число " + n + " составное");               
        } 
        } catch (Exception e) {
            System.out.println ("Ошибка. Вы ввели неверное число");
                }
    }
        }
    
    

