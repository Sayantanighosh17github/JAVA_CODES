import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Designer_PDF_Viewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {

        int arr[]=new int[word.length()];
        for(int i=0;i<h.length;i++){
            for(int j=0;j<word.length();j++)
            {
               int ascii= (int)word.charAt(j);
                arr[j]=h[ascii-97];
            }
        }
        Arrays.sort(arr);
        int area=arr[arr.length-1]*word.length();

        return area;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
