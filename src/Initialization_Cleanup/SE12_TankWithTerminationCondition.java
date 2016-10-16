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
class Tank{
    static int counter;
    int id =counter++;
    boolean full;
    
    Tank(){
        System.out.println("Tank "+id+" created.");
        full=true;
    }
    
    void empty(){
        full=false;
    }
    
    protected void finalize (){
        if(!full){
            System.out.println("The tank "+id+" is cleaned up OK.");
        }
        else{
            System.out.println("The tank "+id+" can't clean up.");
        }
    }
    
}


public class SE12_TankWithTerminationCondition {
    public static void main(String args[]){
        new Tank().empty();
        new Tank();
        System.gc();
        System.runFinalization();
    }
}
