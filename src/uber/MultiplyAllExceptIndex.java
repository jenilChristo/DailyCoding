package uber;/*This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array
is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/

import java.util.Arrays;

public class MultiplyAllExceptIndex {
    public static void main(String[] args){
        MultiplyAllExceptIndex instance = new MultiplyAllExceptIndex();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(instance.getProductArray((arr)));
    }
    //O(n) solution
    public String getProductArray(int[] arr){
        int n = arr.length;
        int[] left = new int [n];
        int[] right = new int [n];
        int[] result = new int[n];
        left[0] = 1;
        right[n-1] = 1;

        for(int i=1;i<n;i++){
            left[i] = left[i-1]*arr[i-1];
        }
        for(int j= n-2;j>=0;j--){
            right[j] = right[j+1]*arr[j+1];
        }
        for(int k= 0; k< n; k++){
            result[k] = left[k]*right[k];
        }

        return Arrays.toString(result);
    }
}
