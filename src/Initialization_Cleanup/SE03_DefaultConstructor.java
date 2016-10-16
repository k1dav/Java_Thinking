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
public class SE03_DefaultConstructor {
    SE03_DefaultConstructor(){
        System.out.println("I'm default constructor");
    }
    SE03_DefaultConstructor(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        SE03_DefaultConstructor n1 = new SE03_DefaultConstructor();
        SE03_DefaultConstructor n2 = new SE03_DefaultConstructor("hi");
    }
}
