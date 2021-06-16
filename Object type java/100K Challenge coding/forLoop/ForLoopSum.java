package forLoop;

import java.util.Scanner;

public class ForLoopSum {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        int num1 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < num1; i++) {
            sum = sum + i;
            
        }
        System.out.println("Result is or Sum is"+sum);

    }
    
}
