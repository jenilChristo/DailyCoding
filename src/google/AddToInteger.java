package google;

import java.util.*;
import java.lang.*;

//This problem was recently asked by Google.
//
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//
//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//
//Bonus: Can you do this in one pass?
public class AddToInteger {
    public static  void main(String[] args){
        AddToInteger instance = new AddToInteger();
        int sum = 13;
        int[] array = {10, 15, 3, 7};
        System.out.println(instance.willAddToInteger(sum, array));
    }
    public boolean willAddToInteger(int sum, int[] array){
        HashMap<Integer,Boolean> temp = new HashMap<Integer,Boolean>();
        int i = 0;
        boolean result = false;

        while(i < array.length){
            try{
                int currentElement = array[i];
                int pair = sum - currentElement;

                if(temp.containsKey(pair)){
                    result = true;
                }else{
                    temp.put(currentElement, true);
                }
                i++;
            }catch (Exception e){
                System.out.println(e);
            }

        }

        return result;
    }
}
