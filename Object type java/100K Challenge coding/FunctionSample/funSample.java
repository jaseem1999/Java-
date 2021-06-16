package FunctionSample;

import java.util.Scanner;

public class funSample {

    

    public static void main(String ar[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int num= sc.nextInt();
        int num1= sc.nextInt();

        int result = sum(num,num1);

        System.out.println("Result is "+result);


    }

    static int sum(int a, int b){
        int s = a+b;
        return s;
    }
    
}
