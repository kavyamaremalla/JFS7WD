package com.java.training;

public class ExceptionHandling {

    // try, catch, finally, throw, throws

    //final vs finally

    static void validate(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Can't cast your vote, please check you age");
        }else{
            System.out.println("Welcome to Voter Bank");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("From Finally block");
        }

        System.out.println("Out from Exception");
    }

}
