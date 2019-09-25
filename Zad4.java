package zad4;
import java.util.Scanner;

public class Zad4 {

    
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
      Scanner   scan1 = new Scanner(System.in);
      String str = scan1.nextLine();
      
      System.out.println("Введите слово: ");
      Scanner scan2 = new Scanner(System.in);
      String word = scan2.nextLine();
      
      str = str.toLowerCase();
      word = word.toLowerCase();
      int i = str.indexOf(word);
        int count = 0;
        while (i >= 0) {
            count++;
            i = str.indexOf(word, i + 1);
        }
        return count;
    }
      
    }
    

