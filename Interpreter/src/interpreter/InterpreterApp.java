/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author ЦАРЬ
 */
public class InterpreterApp {
    public static void main(String[] args) {
		String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal"; 
        InterpreterClient ec = new InterpreterClient(new InterpreterContext());
        System.out.println(str1+"= "+ec.interpret(str1));
        System.out.println(str2+"= "+ec.interpret(str2));
	}
}
