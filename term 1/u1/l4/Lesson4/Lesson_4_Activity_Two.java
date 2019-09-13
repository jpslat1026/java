/*
 * Lesson 4 Coding Activity Question 2
 * 
 * Ask the user their name and age and print out how many years until 
 * they are 100. Note that age should be an integer, not a double.
 *
 * Sample run:
 
Hi there. What is your name?
Pascal
Hi Pascal. How old are you?
16
Pascal, you will be 100 in 84 years.

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_4_Activity_Two {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner (System.in);
        System.out.println("Hi there. What is your name?");
        String n = scan.nextLine();
        System.out.println("Hi " + n + ". How old are you?");
        int age = scan.nextInt();
        int how = 100 - age;
        System.out.println(n + ", you will be 100 in " + how + " years.");


    }
}