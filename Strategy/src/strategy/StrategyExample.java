/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

class StrategyExample {
 
    public static void main(String[] args) {
 
        Context context = new Context();
 
        context.setStrategy(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(3,4);
 
        context.setStrategy(new ConcreteStrategySubtract());
        int resultB = context.executeStrategy(3,4);
 
        context.setStrategy(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(3,4);
        
        context.setStrategy(new ConcreteStrategyDivide());
        int resultD = context.executeStrategy(9,3);

        System.out.println("Result A : " + resultA );
        System.out.println("Result B : " + resultB );
        System.out.println("Result C : " + resultC );
        System.out.println("Result D : " + resultD );
    }
}