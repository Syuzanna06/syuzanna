package zad3;
import java.util.Scanner;
import java.util.Arrays;

public class Zad3 {
static int n = 0, nach = 0, m = 0;
static String s2 = "";

    
    public static void main(String[] args) {
    
      System.out.println("Введите строку: ");
      Scanner   scan = new Scanner(System.in);
      String s = scan.nextLine();
      
      for (int i = 0; i < s.length(); i++) {
          if (s.charAt(i) == ' ') {
              n++;}
      }
      System.out.println("Количество слов в предложении = " + (n+1));
      
      
      
       String[] words = s.split("\\s+");
        Arrays.sort(words);
        System.out.println("Отссортированные слова: " + Arrays.toString(words));
        
        
       s2 = s2 + s.substring(0, 1).toUpperCase();
       for (int i = 1; i < s.length(); i++) {
        if (" ".equals(s.substring(i-1, i)))
            s2 = s2 + s.substring(i, i+1).toUpperCase();
        else
            s2 = s2 + s.substring(i, i+1);}
       System.out.println(s2);
       
    }}
    

