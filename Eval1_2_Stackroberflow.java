/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_2_Stackroberflow {
    public static void main(String[]args){
        A();
        
    }
public static void A(){
    B();
    
}
public static void B(){
    A();
}
}
