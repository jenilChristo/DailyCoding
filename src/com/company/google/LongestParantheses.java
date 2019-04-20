package com.company.google;

import java.util.ArrayList;

public class LongestParantheses {
    private  String parantheses;
    LongestParantheses(String s){
        parantheses = s;
    }
    public Integer getLongest(){
        ArrayList<Integer> stack = new ArrayList<Integer>();
        int result = 0, i=0;
        stack.add(-1);
        while (i < parantheses.length()){
            if(parantheses.charAt(i) == '('){
                stack.add(1);
            }else{
                stack.remove(stack.size()-1);

                if(!stack.isEmpty()){
                    result = Math.max(result, i-stack.get(stack.size()-1));
                }else{
                    stack.add(i);
                }

            }
        i++;
        }
        return result;
    }
    public static void main(String[] args){
        LongestParantheses obj = new LongestParantheses("()()(()");
        System.out.println(obj.getLongest());
    }

}
