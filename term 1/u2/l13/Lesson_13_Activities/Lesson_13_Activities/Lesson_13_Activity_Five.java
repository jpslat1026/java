/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */

import java.lang.Math;
import java.util.Scanner;

class Lesson_13_Activity_Five {
    public static void main(String[] args)
     {
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
      Scanner scan = new Scanner(System.in);

      double randomnumber1 = Math.random();
      double randomnumber2 = Math.random();
      int x =(int)(randomnumber1*12) + 1;
      int y =(int)(randomnumber2*12) + 1;
      System.out.println(x);
      System.out.println(y);
      System.out.println("input the multiplication of the two numbers");
      int num1 = scan.nextInt();
      int awnser = x * y;
      if (num1 == awnser){
        System.out.println("Correct!");
      }else{
        System.out.println("Wrong");
      }


    }
}