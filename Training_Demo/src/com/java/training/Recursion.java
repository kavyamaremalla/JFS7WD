package com.java.training;

public class Recursion {
    public static void main(String[] args) {

        int recursionResult = sum(10);
        System.out.println(recursionResult);

        int rangeRecursionResult = addRange(5, 10);
        System.out.println(rangeRecursionResult);
    }

    public static int sum(int input) {
        if (input > 0) {
            return input + sum(input - 1);
        }else{
            return 0;
        }
    }

    public static int addRange(int start, int end){
        if (end > start){
            return end + addRange(start, end - 1);
        }else {
            return end;
        }
    }
}
