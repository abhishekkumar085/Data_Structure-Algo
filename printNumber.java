
public class printNumber {
    public static void main(String[] args) {

        print(1);
    }

    static void print(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        ;
        print(n + 1);
    }

    // public static void print1(int n) {
    // System.out.println(n);
    // print2(2);
    // }

    // static void print2(int n) {
    // System.out.println(n);
    // print3(3);
    // }

    // static void print3(int n) {
    // System.out.println(n);
    // print4(4);
    // }

    // static void print4(int n) {
    // System.out.println(n);
    // print5(5);
    // }

    // static void print5(int n) {
    // System.out.println(n);

    // }
}

/*
 * while the func is not finished executing it will remain in stack..
 * when a function finishes executing it is removed from stack and the flow of program is restored to where the function is called.
 * Recursion:- Call the function it self.
 * 
 * Base Condition:-Base condition in Recursion :-
 * condition where our recursion will stop making new calls.
 * Recursive call:-If you are calling a function again and again ,you can treat it as a separate call in the stack. 
 * 
 * No base case:-Function calls will keep happening,stack will be filled again and again.
 * Every call of function will take some memory.
 * Memory of computer will exceed the limit - this will get error -> (stack overflow)
 * 
 * why Recursion?:-
 * Ans:-It helps us in solving bigger complex   problem in a simpler way.
 * You can convert the recursion solution into iteration & vice versa.
 * when do we use recursion?
 * Ans:-Space Complexity is not constant because of recursive calls
 * it helps us in breaking down bigger problem into smaller problem.
 * tail Recursion:-Last function call is called tail recursion.
 */
