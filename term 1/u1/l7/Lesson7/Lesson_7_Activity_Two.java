/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_Two {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a three digit number:");
        int x = scan.nextInt();
        int fx = x  % 10;

        int fy = (int)(x * 0.10);
        int fyy = fy % 10;

        int fz = (int)(x * 0.01);
        int fzz = fz % 10;

        int fffx = fzz + fyy + fx;

        System.out.println("Here are the digits:");
        System.out.println(fzz);
        System.out.println(fyy);
        System.out.println(fx);

        System.out.println("Please enter a three digit number:");
        System.out.println(fzz + " + " + fyy + " + " + fx + " = " + fffx);

    }
}