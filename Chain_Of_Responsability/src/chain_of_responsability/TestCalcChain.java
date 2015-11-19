/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain_of_responsability;


public class TestCalcChain {
    public static void main(String[] args) {
        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubstractNumbers();
        Chain chainCalc3 = new MultuplyNumbers();
        Chain chainCalc4 = new DevideNumbers();
        
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);
        
        Numbers request = new Numbers(4,2,"add");
        chainCalc1.calculate(request);
    }
}
