Recursion : when a function calls itself, until a specific condition met.


Basis and Recursion

For a problem to be written in recursive form, two conditions are to be satisfied:

• It should be possible to express the problem in recursive form.
• The problem statement must include a stopping condition

fact(n) = 1,                          if n = 0 /* Stopping criteria */
        = n * fact(n − 1),            if n > 0 /* Recursive form */
		
		
		
		
Examples:

• Factorial:

fact(0) = 1
fact(n) = n * fact(n − 1), if n > 0

• GCD:

gcd (m, m) = m
gcd (m, n) = gcd (m%n, n), if m > n
gcd (m, n) = gcd (n, n%m), if m < n

• Fibonacci series (1,1,2,3,5,8,13,21,….)

fib (0) = 1
fib (1) = 1
fib (n) = fib (n − 1) + fib (n − 2), if n > 1


write a recursive unctions that prints hello 5 time in java

public class RecursiveHello {

    // Recursive function
    static void printHello(int n) {
        if (n == 0) {   // Base condition
            return;
        }

        System.out.println("Hello");

        // Recursive call
        printHello(n - 1);
    }

    public static void main(String[] args) {
        printHello(5);
    }
}



print 1 to 5 using recursion withoutparameters

public class PrintNumbers {

    static int num = 1; // global/static variable

    static void printNumbers() {

        // Base condition
        if (num > 5) {
            return;
        }

        System.out.println(num);

        num++; // increment

        // Recursive call
        printNumbers();
    }

    public static void main(String[] args) {
        printNumbers();
    }
}





print 5 to 1 using recursion withoutparameters

public class ReversePrint {

    static int num = 5; // global/static variable

    static void printReverse() {

        // Base condition
        if (num < 1) {
            return;
        }

        System.out.println(num);

        num--; // decrement

        // Recursive call
        printReverse();
    }

    public static void main(String[] args) {
        printReverse();
    }
}