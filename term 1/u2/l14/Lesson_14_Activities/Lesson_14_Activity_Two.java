/*
 * Lesson 14 Coding Activity 1
 * Test if an integer is not between 5 and 76 inclusive.
 *
 *     Sample Run 1
 *         Enter a number:
 *         7
 *         False
 *
 *         
 *      Sample Run 2
 *         Enter a number:
 *         1   
 *         True
 * 
 */


import java.util.Scanner;

class Lesson_14_Activity_Two {
    public static void main(String[] args)
     {
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
      Scanner scan = new Scanner(System.in);

      int x = scan.nextInt();
      int y = scan.nextInt();

      if (x >= 0 && y >= 0) {
        System.out.println("Both are positive or zero.");
      } else {
        System.out.println("One or both are negative.");
      }
    }
}