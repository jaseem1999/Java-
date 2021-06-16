package Average;

import java.util.Scanner;

public class avgThree {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbe");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int av;

        av = (num+num2+num3)/3;
        System.out.println("Average is " + av);


    }
    
}
