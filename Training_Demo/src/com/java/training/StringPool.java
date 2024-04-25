package com.java.training;


public class StringPool {
    public static void main(String[] args) {

        String str1 = "Java";

        String str2 = "Python";

        String str3 = "Java";

        String str4 = new String("c");
        String str5= new String("Python").intern();
        String str6 = new String("c");

        System.out.println(str1==str3); //true
        System.out.println(str2==str3); //false

        System.out.println(str4==str6); //false
        System.out.println(str2==str5); //false, in case of intern.. true

        System.out.println(str2.equals(str5));//true

    }
}
