import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float number;

        System.out.println("Enter A number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("Even");
            
        }
        else{
            System.out.println("Odd");
        }
    }
}
