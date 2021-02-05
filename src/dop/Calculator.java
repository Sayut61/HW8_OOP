package dop;

import org.omg.CORBA.UserException;

public class Calculator {
    public static int add(int a, int b) {
        int res = a + b;
        return res;
    }
    public static int sub(int a, int b) {
        int res = a - b;
        return res;
    }

    public static int mul(int a, int b) {
        int res = a * b;
        return res;
    }

    public static int div(int a, int b) {
            try {
               return a / b;
            }
            catch (ArithmeticException e){
                System.out.println("Exeption");
                return -1;
            }
    }
}
