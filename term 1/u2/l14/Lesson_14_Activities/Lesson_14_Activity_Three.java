/*
 * Lesson 14 Coding Activity 3
 * The Internet runs on web addresses.The addresses we type represent the IP address 
 * for each site and how the computer finds an individual web page.
 *
 * IP addresses are made up of four numbers, each between 0 and 255 separated by a period. 
 * For example, 128.253.21.58 is an IP address.
 * 
 * Write a program to enter four numbers and test if they make up a valid IP address.
 * In other words, test to see if the numbers entered are between 0 and 255 inclusive.
 * 
 *     Sample Run 1
 *         Please enter the first octet:
 *         898
 *         Please enter the second octet:
 *         34
 *         Please enter the third octet:
 *         712
 *         Please enter the fourth octet:
 *         45
 *         Octet 1 is incorrect
 *         Octet 3 is incorrect
 * 
 *         
 *      Sample Run 2
 *         Please enter the first octet:
 *         112
 *         Please enter the second octet:
 *         200
 *         Please enter the third octet:
 *         0
 *         Please enter the fourth octet:
 *         254
 *         IP Address: 112.200.0.254
 * 
 */


import java.util.Scanner;

class Lesson_14_Activity_Three {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the first octet:");
    int x = scan.nextInt();
    System.out.println("Please enter the second octet:");
    int y = scan.nextInt();
    System.out.println("Please enter the third octet:");
    int z = scan.nextInt();
    System.out.println("Please enter the fourth octet:");
    int c = scan.nextInt();
    boolean valid = true;
    if (x < 0 || x > 255) {
      System.out.println("Octet 1 is incorrect");
      valid = false;
    }
    if (y < 0 || y > 255) {
      System.out.println("Octet 2 is incorrect");
      valid = false;
    }
    if (z < 0 || z > 255) {
      System.out.println("Octet 3 is incorrect");
      valid = false;
    }
    if (c < 0 || c > 255) {
      System.out.println("Octet 4 is incorrect");
      valid = false;
    }
    if (valid) {
      System.out.println("IP Address: "
          + x + "." + y + "." + z + "." + c);
    }
  }
}