import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Birthday_Cake_Candle {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int counter = 1;
        /*
        int sizeOfarr = ar.length;
        int array = ar.length - 1;
        for(int i = 1;i<array;i++){
            for(int j=i+1;j<sizeOfarr-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;

                }

            }
            System.out.println(ar[0]);
        }
        */
        Arrays.sort(ar); //Array sorted in ascending order
        //Boro number gulo kon kon position e ache check korte hobe
        for(int i=ar.length-1; i>0; i--){


            if(ar[ar.length-1] == ar[i-1]){
                counter++;
            }
            else
            break;//checking whether the number in the last and i-1th positions are equal or not. if equal, counter++ to check whether any more equal numbers are there or not
            //System.out.println(counter);// print the all greatest equal numbers
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
