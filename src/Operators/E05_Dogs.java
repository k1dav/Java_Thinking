/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;

/**
 *
 * @author Hope
 */
class Dog{
    String name;
    String says;
}

public class E05_Dogs {
    public static void main(String args[]){
        Dog a = new Dog();
        Dog b = new Dog();
        a.name="spot";
        a.says="Ruff!";
        b.name="scruffy";
        b.says="Wurf!";
        System.out.println(a.name+" says "+a.says);
        System.out.println(b.name+" says "+b.says);
    }
}
