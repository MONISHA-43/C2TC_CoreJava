package day1;
public class Operator {
      public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + !x);          // Logical NOT

        // Bitwise Operators
        int p = 6, q = 3;
        System.out.println("p & q: " + (p & q)); // Bitwise AND
        System.out.println("p | q: " + (p | q)); // Bitwise OR
        System.out.println("p ^ q: " + (p ^ q)); // Bitwise XOR
        System.out.println("~p: " + ~p);         // Bitwise NOT
        System.out.println("p << 1: " + (p << 1)); // Left shift
        System.out.println("p >> 1: " + (p >> 1)); // Right shift
        System.out.println("p >>> 1: " + (p >>> 1)); // Unsigned right shift

        // Assignment Operators
        int r = 10;
        r += 5; // r = r + 5
        System.out.println("r after += 5: " + r);

        // Unary Operators
        int num = 5;
        System.out.println("++num: " + ++num); // Increment
        System.out.println("--num: " + --num); // Decrement

        // Conditional (Ternary) Operator
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);

        // Instanceof Operator
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));

        // Type Cast Operator
        double pi = 3.14;
        int piInt = (int) pi;
        System.out.println("pi as integer: " + piInt);
    }
}



