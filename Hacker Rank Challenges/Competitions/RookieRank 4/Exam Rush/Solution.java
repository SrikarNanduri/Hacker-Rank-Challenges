

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int examRush(int[] tm, int t) {
        // Complete this function
        int time_count = 0;
        ArrayList<Integer> cun = new ArrayList<>();


        for(int i = 0; i< tm.length; i++){

            if (i+1 <= tm.length) {
                if (t >= tm[i]) {
                    cun.add(tm[i]);
                }
            }
        }
        Collections.sort(cun);
        System.out.println(cun);
        int max=t;
        for(int j=0; j < cun.size(); j++ ){
            if(cun.get(j) <= max) {
                max -= cun.get(j);
                time_count++;
            }
        }

        return time_count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] tm = new int[n];
        for(int tm_i = 0; tm_i < n; tm_i++){
            tm[tm_i] = in.nextInt();
        }
        int result = examRush(tm, t);
        System.out.println(result);
        in.close();
    }
}

