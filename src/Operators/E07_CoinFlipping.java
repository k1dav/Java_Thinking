/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;
import java.util.*;
/**
 *
 * @author Hope
 */
public class E07_CoinFlipping {
    public static void main(String args[]){
    Random rand = new Random();
    for(int i=1;i<=10;i++){
        int j = rand.nextInt(2);
        if(j==1){
            System.out.println("Head");
        }
        else{
            System.out.println("Tail"); 
        }
        
        }
    }
}
