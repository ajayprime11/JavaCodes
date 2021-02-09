package food;

import java.util.*;
public class ScannerSkipPattern {
     public static void main(String []args){
                Scanner sc1=new Scanner(System.in);
                String str=sc1.nextLine();
                Scanner sc=new Scanner(str);
                String pattern="[A-Za-z]*";
                while(sc.hasNext()){
                    sc.skip(pattern);
                    System.out.println(sc.next());
                }
                sc.close();
                sc1.close();
     }
}