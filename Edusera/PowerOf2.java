package Edusera;
import java.util.*;

public class PowerOf2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        int y = a&(a-1);
        if(y==0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a Power of 2");
        }
        sc.close();
    }
    
}
