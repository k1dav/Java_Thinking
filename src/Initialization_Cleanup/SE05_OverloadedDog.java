/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Initialization_Cleanup;

/**
 *
 * @author Hope
 */
class Dog{
    public void bark(){
        System.out.println("barking");
    }
    public void bark(int n){
        System.out.println("howling");
    }
    public boolean bark(double d){
        System.out.println(d);
        return true;
    }
}

public class SE05_OverloadedDog {
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark(0.1);
    }
}
