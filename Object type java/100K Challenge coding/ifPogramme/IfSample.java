package ifPogramme;

import java.util.Scanner;

public class IfSample {
 public static void main(String  ar[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("Eter a number");

      int num=sc.nextInt();

      if (num<0){
          System.out.println("Number is Neghative");

      }
      else{
          System.out.println("Number is positive");
      }
    }
}
