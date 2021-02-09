import java.io.*;
import java.util.*;
public class MatchingPair {
    static int sockMerchant(int n, int[] ar) {
            int length=ar.length;
            int count=0;
            for(int i=0;i<length;i++){
                for(int j = 0 ; j< length-1 ; j++){
                    if(ar[j]>ar[j+1]){
                    int temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                   }
                }
            }
            for(int k=0;k<length-1;k++){
                if(ar[k]==ar[k+1]){
                    count++;
                    k++;
                }
            }
            return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}