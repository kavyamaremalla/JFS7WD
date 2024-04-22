package com.java.training;

public class SuperKeyWord {
    public static void main(String[] args) {
        Animal myPet = new Dog();
        myPet.animalSound();
    }
}

class Animal{ //super class or parent
    public void animalSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{//sub class or child
    public void animalSound(){
        super.animalSound(); // calling your parent method
        System.out.println("Dog says : bow bow");
    }
}
