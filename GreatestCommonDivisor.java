// greatest common divisor between two numbers

import java.util.*;

public class GreatestCommonDivisor
{
    public static int greatestCommonDivisor(int x, int y){
        int gcd = 1;
        for(int i=1; i<=x && i <=y; i++){
            if( x % i == 0 && y % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        int gcd = greatestCommonDivisor(x, y);
        System.out.println("greatest common divisor between "+x+" and "+y+" is "+ gcd);
    }
}
