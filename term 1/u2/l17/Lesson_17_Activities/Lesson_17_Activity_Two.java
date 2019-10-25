/*
 * Lesson 17 Coding Activity 2
 * Ask the user for two numbers. Print only the even numbers between them,
 * you should also print the two numbers if they are even.
 * 
 *     Sample Run 1:
 *         
 *         Enter two numbers:
 *         3
 *         11
 *         
 *         4 6 8 10 
 * 
 *    Sample Run 2:
 *         
 *         Enter two numbers:
 *         10
 *         44
 *         
 *         10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44         
 * 
 * 
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_17_Activity_Two {
    public static void main(String[] args)
     {
/*
 * Write your code here
 * Copy and paste your entire program to Code Runner
 * to complete the activity, from the x import statement
 * to the last bracket.
 */


System.out.println("Enter two numbers:");
Scanner scan = new Scanner(System.in);
int x = scan.nextInt();
int y = scan.nextInt();
for (int i=x; i<=y; i++) {
  if (i % 2 == 0) {
    System.out.print(i+" ");
  }
}



}
}