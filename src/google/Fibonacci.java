package com.company.com.company.google;

public class Fibonacci {
    public Fibonacci(){

    }
    public static void main(String[] args){
        Fibonacci instance = new Fibonacci();
        System.out.println(instance.getFibonacci(100));
    }

    public int getFibonacci(int n){
        int result;
        int memo[] = new int[n+1]; // memoize array
        memo[0] = 1; //handle base case
        memo[1] =1;
        //back-track memoize array in O(n)
        for(int i=2; i <= n ;i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
}
