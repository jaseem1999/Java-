import java.util.Scanner;

public class App {
    private static final String ADIL = "adil";

    public static void main(String[] args) throws Exception {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
    
        String name = scanner.next();
        String name1 ;
        name1 = ADIL;
        if (name == ADIL) {
            System.out.println("Poda pati"+ name1);
        }else{


        System.out.println("Hello, "+name+"!");
        }
    }
}
