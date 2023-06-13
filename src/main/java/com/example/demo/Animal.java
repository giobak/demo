package com.example.demo;

public class Animal {
    public void run() {
        System.out.println("Animal can run");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();

        cat.run();
        dog.run();
        mouse.MouseFly();



    }
}
