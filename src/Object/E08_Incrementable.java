/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Hope
 */
public class E08_Incrementable {
    static int i =47;
    static void increment(){
        E08_Incrementable.i++;
    }
    
    public static void main(String args[]){
        E08_Incrementable test = new E08_Incrementable();
        System.out.println("Before increment = " + test.i);
        E08_Incrementable.increment();
        test.increment();
        System.out.println("After increment = " + test.i);
    }
}
