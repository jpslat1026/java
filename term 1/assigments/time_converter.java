
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

class time_converter{


     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner(System.in);
          



          //System.out.println();
          System.out.println("Seconds Since Unix Epoch:");
          int s = scan.nextInt();
          int minuets = s / 60;
          int secondsr = s % 60;

          int hours = minuets / 60;
          int minuetsr = minuets % 60;

          int days = hours / 24;
          int hoursr = hours % 24;

          int months = days / 30;
          int daysr = days % 30;

          int year = months / 12 + 1970;
          int monthsr = months % 12;



          


          System.out.println("\nYear:" + year + "\nMonth: " + monthsr + "\nDay: " + daysr + "\nHour: " + hoursr + "\nMin: " + minuetsr + "\nSec: " + secondsr);










     }

}


