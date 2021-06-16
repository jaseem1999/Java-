public class App {
    public static void main(String[] args) throws Exception {
        

        sample s1= new sample();
        sample s2= new sample();

        s1.a = 20;
        s2.a = 50;
        s1.b=200;
        s2.b =100;
        
        System.out.println("S1- a : " + s1.a+ "s2- a "+s2.a+"s1 - b "+s1.b);


    }
}
