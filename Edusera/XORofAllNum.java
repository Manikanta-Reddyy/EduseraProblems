package Edusera;

import java.util.*;

public class XORofAllNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        for (int i = a; i <= b; i++) {
            result = result^i;
        }
        System.out.println(result);
        sc.close();
    }
}