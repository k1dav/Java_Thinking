/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlling_Execution;

/**
 *
 * @author Hope
 */
public class WhileExample {
    static boolean condition(){
        boolean result = Math.random()<0.99;
        System.out.print(result +", ");
        return result;
    }
    public static void main(String args[]){
        while(condition())
            System.out.println("inside 'while'");
        System.out.println("Exited 'while'");
    }
}
