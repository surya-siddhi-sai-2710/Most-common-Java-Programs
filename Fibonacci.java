// to print fibonacci series till user desired limit

import java.util.*;

public class Fibonacci
{
    public static void fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1+" "+n2+" ");
        for(int i = 2; i <= n; i++){
            n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter fibonacci limit: ");
        int n = sc.nextInt();
        fibonacci(n);
    }
}
