package com.example.demo;

public class Cat extends Animal{

    String name;
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.run();
        dog.run();


        System.out.println(cat);
    }
}
