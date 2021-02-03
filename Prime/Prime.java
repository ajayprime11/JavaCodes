import java.util.*;
public class Prime {
     public static void main(String []args){
            int a;
            boolean isNprime=false;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number");
            a=sc.nextInt();
            for(int i=2;i<a;i++){
                if(a%i==0)
                     isNprime=true;
            }
            if(!isNprime){
                System.out.println("Number is prime");
            }
            if(isNprime){
                System.out.println("Number is not-prime");
            }
            sc.close();
     }
}