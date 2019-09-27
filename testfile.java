
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

class testfile{


     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner(System.in);
          



          //System.out.println();

          int base = 2;
int exponent = scan.nextInt();
int answer = (int)Math.pow(base, exponent);
if (answer <= 256)
    System.out.println("exponent is 8 or less");











     }

}


