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






print "Before Call" and "After Call" to observe call order


static void printNumbers() {

    if (num > 3) {
        return;
    }

    int current = num;

    System.out.println("Before Call: " + current);

    num++;

    printNumbers();

    System.out.println("After Call: " + current);
}






print numbers from 1 to n after the recursive call


public class PrintAfterCall {

    static void printNumbers(int n) {

        // Base condition
        if (n == 0) {
            return;
        }

        // Recursive call first
        printNumbers(n - 1);

        // Print after recursive call
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}







print numbers 1 to n before the recursive call

public class PrintOneToN {

    static void printNumbers(int current, int n) {

        // Base condition
        if (current > n) {
            return;
        }

        // Print before recursive call
        System.out.println(current);

        // Recursive call
        printNumbers(current + 1, n);
    }

    public static void main(String[] args) {
        printNumbers(1, 5);
    }
}




sum of first n numbers using recursion with parameters

public class SumOfNumbers {

    static int sum(int n) {

        // Base condition
        if (n == 0) {
            return 0;
        }

        // Recursive relation
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        int result = sum(5);

        System.out.println("Sum = " + result);
    }
}



sum of first n numbers using recursion with parameters

public class SumWithTwoParameters {

    static void sum(int i, int sum) {

        // Base condition
        if (i < 1) {
            System.out.println("Sum = " + sum);
            return;
        }

        // Recursive call
        sum(i - 1, sum + i);
    }

    public static void main(String[] args) {

        sum(5, 0);
    }
}





factorial of first n numbers


public class FactorialRecursion {

    static int factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive relation
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int result = factorial(5);

        System.out.println("Factorial = " + result);
    }
}




factorial of first n numbers using two parameters



public class FactorialWithParameters {

    static void factorial(int n, int fact) {

        // Base condition
        if (n < 1) {
            System.out.println("Factorial = " + fact);
            return;
        }

        // Recursive call
        factorial(n - 1, fact * n);
    }

    public static void main(String[] args) {

        factorial(5, 1);
    }
}





You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

Examples :

Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
Input: s = "abc" 
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.




class Solution {
    
    boolean check_recursive(String s, int left, int right)  {
        
         while(left<right) {
            
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            
            return check(s, left+1, right-1);
        }
        return true;
    }
    
    
boolean check(String s, int left, int right) {

        if (left >= right) return true;

        if (s.charAt(left) != s.charAt(right)) return false;

        return check(s, left + 1, right - 1);
    }



    boolean isPalindrome(String s) {
        
       s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
       
       return check(s, 0, s.length()-1);
       
    }
}

