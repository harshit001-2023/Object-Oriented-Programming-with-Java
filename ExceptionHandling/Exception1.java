package ExceptionHandling;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age for voting eligibility");
        int age = sc.nextInt();

        if (age < 18) throw new RuntimeException("You're not eligible");
        else System.out.println("You can vote");
    }
}
