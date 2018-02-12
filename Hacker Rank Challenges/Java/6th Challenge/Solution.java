import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 1; i<=10 ; i++){
           System.out.printf("%d x %d = %d\n", N, i, N*i);
            
        }
    }
}