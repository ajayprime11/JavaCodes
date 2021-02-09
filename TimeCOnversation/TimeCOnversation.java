package Protect;

import java.io.*;
import java.util.*;
public class TimrCOnversation {
      static String timeConversion(String s) {
         String s4=s;
           String s1=s4.substring(0,2);
           String s2=s4.substring(2,5);
           String s3=s4.substring(5,7);
           System.out.println(s1+""+s2+""+s3);
           return s1;
    }
     private static final Scanner scan = new Scanner(System.in); 
      public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
          String s = scan.nextLine();
          String result = timeConversion(s);
        bw.write(result);
        bw.newLine();
        bw.close();
    }
}