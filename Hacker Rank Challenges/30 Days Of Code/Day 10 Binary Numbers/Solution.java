import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tmpCount = 0; // count consecutive ones
        int maxCount = 0;
        char [] a =Integer.toBinaryString(n).toCharArray();
        for(int i =0; i< a.length; i++){
            tmpCount = (a[i] == '0') ? 0 : tmpCount + 1;

            // set max
            if(tmpCount > maxCount){
                maxCount = tmpCount;
            }
        }
        System.out.println(maxCount);
    }
}