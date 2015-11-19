/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

class ConcreteStrategyDivide implements Strategy {
 
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyDivide's execute()");
        return a / b;   // Do a divide with a and b
    }    
}
