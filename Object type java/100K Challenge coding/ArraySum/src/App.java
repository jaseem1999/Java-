import java.util.Scanner;

public class App {
    public static void main(String ar[]) throws Exception {
        int Array_limit, sum = 0;
        int EnValue[100];
        System.out.println("Enter Array limit : ");
        System.out.println("Enter the values : ");
        Scanner sc = new Scanner(System.in);
        Array_limit = sc.nextInt();
        for (int i = 0; i < Array_limit; i++) {
            EnValue[i] = sc.nextInt();
        }
        for (int i = 0; i < Array_limit; i++) {
            sum = sum + EnValue [i];
        }
        System.out.println("Sum is : "+ sum);

    }
}
