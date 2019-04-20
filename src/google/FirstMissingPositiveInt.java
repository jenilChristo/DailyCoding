package google;

/*
This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
 */
public class FirstMissingPositiveInt {
    public static void main(String[] args){
        int[] arr = {1, 2, 0};
        FirstMissingPositiveInt instance = new FirstMissingPositiveInt();
        System.out.println(instance.getFirstMissing(arr));
     }
     public int getFirstMissing(int[] arr){
        int n = arr.length;
        int min= arr[0] ,i=0;

        for(int j=0;j<n;j++){

        }

        while(i<n){
            if(arr[i] < min && arr[i] > 0 ){
                min = arr[i];
            }
            i++;
        }
        return min;
     }
}
