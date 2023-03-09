package Edusera;
import java.util.*;

public class PowerOf {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();

        while(a>1) {

            if(a%4==0) {
                a = a/4;
            } else
             break;

         } if (a == 1) {
            System.out.println("Power of 4");
         } else {
            System.out.println("Not a Power of 4");
         }
    sc.close();
    }
}
