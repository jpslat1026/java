/*
 * Lesson 11 Coding Activity 4
 * Test if an integer input from the keyboard is odd or even.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 */

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_Four {   
public static void main(String[] args) 
   { 
   /* Write your code here 
    * Copy and paste your entire program to Code Runner to complete the activity, 
    * from the first import statement to the last bracket. 
    */

    Scanner scan = new Scanner(System.in);

    System.out.println("Please input an interger");
    int num1 = scan.nextInt();

    int r = Math.abs(num1) % 2;



    if (r == 0)
    {
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }

    }
}