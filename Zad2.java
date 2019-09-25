package zad2;
import java.util.Scanner;

public class Zad2 {

    
    public static void main(String[] args) {
       int NOD, NOK, n, m, c, d;
       try {
       System.out.print("Введите целое число a = ");
       Scanner a = new Scanner(System.in);
       n = a.nextInt();
       
       System.out.print("Введите целое число b = ");
       Scanner b = new Scanner(System.in);
       m = b.nextInt(); c = n; d = m;
       while (n != 0 && m != 0){
        if (n > m) {
           n %= m;
        } else { 
           m %= n;
        }}
       NOD = n + m;
       System.out.println("NOD = " + NOD);
       
       NOK = c * d / NOD;
       System.out.println("NOK = " + NOK);
       } catch (Exception e) {
            System.out.println ("Ошибка. Вы ввели неверное число");
                }
       
    }}
    

