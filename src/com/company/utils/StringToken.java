package com.company.utils;
import java.util.StringTokenizer;

public class StringToken  {
    public static void main(String[] args){
        StringTokenizer ob = new StringTokenizer("hackersh hacker","h");

        while(ob.hasMoreTokens()){
            System.out.println(ob.nextToken());
        }
    }
}
