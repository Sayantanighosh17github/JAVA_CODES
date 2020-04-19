package Hackerrank.Day3;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Compare_the_triplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

/*
    grades.get(i)//to get the  ith index value
    grades.set(i,<value>) //to set value at the ith index
    .size()// instead of length
*/
int counter = 0;




int Alice=0;
int Bob= 0;


    for(int i=0;i<b.size();i++){
        if((a.get(i))>(b.get(i))){
            Alice ++;
        }
        else if((a.get(i))<(b.get(i))){
            Bob++ ;
        }
        else if((a.get(i))==(b.get(i))){
           // No points to anyone
        }
        
    }
    ArrayList<Integer> store = new ArrayList<>();
    store.add(Alice);
    store.add(Bob);
    return store;

}
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
