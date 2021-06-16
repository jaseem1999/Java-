package ifPogramme.LargNumber;

import java.util.Scanner;

public class LargeNum {
    public static void main(String ar[]) {
        System.out.println("Enter Two Number");
        Scanner nc = new Scanner(System.in);
        int num1 = nc.nextInt();
        int num2 = nc.nextInt();

        if (num1 > num2) {
            System.out.println("First Number Biggest");
            
        }else{
            System.out.println("Second Number Biggest");
        }


    }
    
}
