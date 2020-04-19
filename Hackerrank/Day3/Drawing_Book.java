package Hackerrank.Day3;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Drawing_Book {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        //int frontpage = p/2;  //6pages of book, and e want to find the pages of 4 & 5, tahole 2 diye divide korle 3 ashe. & 3bar ultalei ei 4 & 5 ashe
        //int backpage =(n-p)/2;  //same as above
       /* 6 page  8
        4 & 5
        1/2 3/4 5 -> 2times without the firstpage
        6/4 5 -> 1 time without the lastpage
       // 8/6 7/4 5 -> 2 times
        */
        //backpage = frontpage - backpage; //amar backpage ta berolo.

        int result=((p/2)>((n-p)/2))?(n-p)/2:p/2;

        if((n-p)==1 && n%2==0)
        result=((p/2)>(1))?1:p/2;
        /*
        if(frontpage<backpage){
            result=frontpage;
        }
        else if(frontpage == backpage){

            result=frontpage;
        }
        else{
            result=backpage;
        }*/
        return result;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
