package food;
import java.util.*;
public class ScannerSkipString {
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter message");
         String message=sc.nextLine();
         Scanner sc1=new Scanner(message);
         System.out.println("Enter Skip String");
         String skip=sc.nextLine();
         sc1.skip(skip);
         System.out.println(sc1.nextLine());
         sc1.close(); 
         sc.close();
     }
}