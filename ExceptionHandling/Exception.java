package ExceptionHandling;

import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dividend and Divisor");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        try {
            int result = dividend / divisor;
            System.out.println("Dividend / Divisor = "+result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("The finallly block");
        }

    }
}
