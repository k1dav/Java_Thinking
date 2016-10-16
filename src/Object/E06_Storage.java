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
public class E06_Storage {
    String s = "01234";
    int storage(String s){
        return s.length()*2;
    }
    void print(){
        System.out.println("Storage(s) = "+storage(s));
    }
    public static void main(String args[]){
        E06_Storage s= new E06_Storage();
        s.print();
    }
}
