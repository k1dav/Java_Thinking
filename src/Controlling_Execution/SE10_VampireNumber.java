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
public class SE10_VampireNumber {
    
    public static void main(String args[]){
        int []start = new int [4];
        int []product = new int [4];
        for(int num1=10;num1<=99;num1++){
            for(int num2=num1;num2<=99;num2++){
                if((num1*num2)%9!=(num1+num2)%9)
                    continue;
                start[0]=num1/10;
                start[1]=num1%10;
                start[2]=num2/10;
                start[3]=num2%10;
                
                int ans=num1*num2;
                if(ans<1000){
                    continue;
                }
                product[0]=ans/1000;
                product[1]=ans%1000/100;
                product[2]=ans%1000%100/10;
                product[3]=ans%1000%100%10;
                
                int c=0;
                for(int x=0;x<4;x++){
                    for(int y=0;y<4;y++){
                        if(start[x]==product[y]){
                            c++;
                            start[x]=-1;
                            product[y]=-2;
                            if(c==4){
                                System.out.println(num1+"*"+num2+"="+ans);
                            }
                        }
                    }
                }
            }
        }
    }
}
