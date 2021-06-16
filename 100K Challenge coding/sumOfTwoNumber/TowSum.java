package sumOfTwoNumber;

import java.util.Scanner;

public class TowSum {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two numbe ");
        
        int num1=s.nextInt();
        int num2=s.nextInt();
        int sumOfTwoNumber= num1 + num2;
        System.out.println("Result :"+sumOfTwoNumber);

    }
}
