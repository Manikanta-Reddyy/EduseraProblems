package Edusera;
import java.util.*;

public class PowerOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int y = a&(a-1);
        if (y == 0 && a % 3 == 1) {
            
          System.out.println("Power of 4");
            
        } else {
            
            System.out.println("Not a Power Of 4");
        }
        sc.close();
    }
}


// If a number is a power of 4 then it is also a power of 4 

//  All the powers of 4 are the power of 2 viceversa may not be possible
//  All powers of 4 when divided by 3 remainder will be 1