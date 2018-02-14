package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static int power(int x, int y) throws Exception{
        if(x < 0 || y < 0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            return (int)Math.pow(x,y);
        }
    }

    public static void main(String[] args) throws Exception {
        //Write your code here
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n = 0;
        int p = 0;
        double c = 0;
Main a = new Main();
        for( int i = 0 ; i< T ; i++){
            n = in.nextInt();
            p = in.nextInt();
            try {
                c = a.power(n, p);
                System.out.println(c);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }



    }
}