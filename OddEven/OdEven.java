import java.util.Scanner;
public class OdEven {
    public static void main(String []args){
    int a;
   Scanner sc=new Scanner(System.in);
   System.out.println("Choose your Way to find Odd even");
   System.out.println("1.One no at a time");
   System.out.println("2.fine all even and odd till n");
   int l=sc.nextInt();
   switch (l) {
       case 1:
           System.out.println("enter Number");
            a=sc.nextInt();
            if(a %2 == 0)
             System.out.println("Number is EVEN"); 
             if(a %2 == 1)
             System.out.println("Number is ODD");
             break;
        case 2:
             System.out.println("Enter range Number"); 
             a=sc.nextInt();
             System.out.print("EVEN : "); 
             for(int i=0;i<a;i++){ 
                if(i %2 == 0)
                System.out.print(" "+i); 
            }
            System.out.println();
            System.out.print("ODD : ");
            for(int i=0;i<a;i++){ 
                if(i %2 == 1) 
                System.out.print(" "+i); 
            }
             break;
       
            default :
            System.out.println("Wrong Choice");
           break;
   }
      }
}
