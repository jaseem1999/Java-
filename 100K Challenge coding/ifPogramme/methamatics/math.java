package ifPogramme.methamatics;

import java.util.Scanner;

public class math {
    public static void main(String ar[]) {
        System.out.println("Enter Two numbe :");
        Scanner sc = new Scanner(System.in);
        float numbe = sc.nextFloat();
        float numbe2 = sc.nextFloat();
        float result;
        
        System.out.println("1 for addition \n2 for substraction \n3 for mutiplication \n4 for division \nEnter Your choise 1,2,3,4 ");
        int i = sc.nextInt();
        if (i == 1) {
            result = numbe + numbe2;
            System.out.println(numbe +"+"+numbe2 +":" + result);
        }
        
        else if( i == 2){
            result = numbe - numbe2;
            System.out.println(numbe +"-"+numbe2 +":" + result);
        }
        
        else if( i == 3){
            result = numbe * numbe2;
            System.out.println(numbe +"x"+numbe2 +":" + result);
        }
        
        else if( i == 4){
            result = numbe / numbe2;
            System.out.println(numbe +"/"+numbe2 +":" + result);
        }
        
        else{
            System.out.println("Fool");
        }

    }
    
}
