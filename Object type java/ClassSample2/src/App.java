public class App {
    public static void main(String[] args) throws Exception {
        int a =100, b=200;
        int c = 300, d=400;
        sum s= new sum();
        sum s1= new sum();


        s.calculateSum(a, b);
        s.displaySum();

        s1.calculateSum(c, d);
        s1.displaySum();
        s.displaySum();
    }
}
