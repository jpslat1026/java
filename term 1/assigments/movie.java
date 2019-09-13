
import java.util.Scanner;
import java.lang.Math;

class movie {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter three ratings from the movie review website");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double g = ((double)a + (double)b + (double)c) / 3;
        double ag = g * 0.20;

        System.out.println("Please enter ratings from the focus group.");
        double d = scan.nextDouble();
        double e = scan.nextDouble();

        double h = (d + e)/2;
        double ah = h * 0.30;

        System.out.println("Please enter the average movie critic rating.");
        double f = scan.nextDouble();
        double af = f * 0.50;
        double ov = ag + ah + af;
        System.out.println("Average website rating: " + g);
        System.out.println("Average focus group rating: " + h);
        System.out.println("Average movie critic rating: " + f);
        System.out.println("Overall movie rating: " + ov);

    }
}