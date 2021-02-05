package dop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1-е число ");
        int a = in.nextInt();
        System.out.println("Введите 2-е число ");
        int b = in.nextInt();

        try {
            System.out.println(Calculator.div(a,b));
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(Calculator.add(a,b));
            System.out.println(Calculator.mul(a,b));
            System.out.println(Calculator.sub(a,b));
        }

    }
}
