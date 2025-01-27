package Java;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter your number : ");
        int originalNumber = sc.nextInt(); // Store the original number
        int n = originalNumber; // Copy the original number for calculations
       
        int number_count=0;
       
       
        while(n>0){
            n=n/10;
            number_count++;
        }

        System.out.print("the given number is " + originalNumber + " the count of number is " + number_count );

    }
}
