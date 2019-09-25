package zad5;
import java.util.Scanner;

public class Zad5 {

    
    public static void main(String[] args) {
        int N, a, c, b;
        int [] mas;
  
        System.out.println("Введите количснтво элементов. Оно должно быть меньше 100 :" );

        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        
        mas = new int[N];
        
        for( int i = 0; i< N; i++) {
            mas[i] = i;
            System.out.print(mas[i] + ",");
            
        }
            for( int i = 10; i< N; i++) {
            a = mas[i]; 
            c = a;
            b = 0;
                while (c > 0) {
                   b = b * 10 + c % 10;
                    c = c / 10; }
                if (b == a) {
                    System.out.println(" Число " + mas[i] + " палиндром");
                    
            }
          
        }
   
            
        }
    }
    

