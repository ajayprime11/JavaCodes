import java.util.Scanner;
class BigNumber{
    public static void main(String []args){
        System.out.println("enter your choice for finding Big Number");
        System.out.println("1.USING IF-ELSE");
        System.out.println("2.USING TERNARY OPERATOR");
        System.out.println("3.USING IF-ELSE");
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        switch(l){
        case 1:
            System.out.println("---------------------------------------------------USING IF-ELSE---------------------------------------------------");
            System.out.println("Enter 3 numbers");
             a=sc.nextInt();
             b=sc.nextInt();
             c=sc.nextInt();
            if(a>b && a>c){
                System.out.println("Biggest No is "+a);
            }
            if(b>c){
                System.out.println("Biggest No is "+b);
            }
            else
             System.out.println("Biggest No is "+c);
             break;
        case 2:
            System.out.println("---------------------------------------------------USING TERNARY OPERATOR---------------------------------------------------"); 
            //TERNARY OPERATOR
             a=sc.nextInt();
             b=sc.nextInt();
             c=sc.nextInt();
            int d=a>b ? a>c ? a : c : b>c ? b : c;
            System.out.println("Biggest No is "+d);
            break;
        case 3:
            System.out.println("---------------------------------------------------USING BUBBLE SORT---------------------------------------------------");
            System.out.println("Enter Size of input");
            int i=0,j=0;
            int n=sc.nextInt();
            int ai[] = new int[n];
            for(i=0;i<ai.length;i++){
            ai[i]=sc.nextInt();
                                    }
            for(i=0;i<n-1;i++){
                for( j=0;j<n-i-1;j++){
                    if(ai[j]<ai[j+1]){
                        int temp=ai[j];
                        ai[j]=ai[j+1];
                        ai[j+1]=temp;    
                                     }
                                      }
                            }
            System.out.println("Biggest no is "+ai[0]);
            break;    
        default :
            System.out.println("wrong input");
    }
  sc.close();
}
}

