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
public class SE09_Fib {
    static int fib(int n){
        if(n<=2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    
    public static void main (String args[]){
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            System.out.println("Fib("+i+") = "+fib(i)+" ");
        }
    }
}
