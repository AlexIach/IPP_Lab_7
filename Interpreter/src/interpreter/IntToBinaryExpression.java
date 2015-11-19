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
public class IntToBinaryExpression implements Expression {
	
	private int i;
	
	public IntToBinaryExpression(int i) {
		this.i = i;
	}


	@Override
	public String interpret(InterpreterContext interpreterContext) {
		return interpreterContext.getBinaryFormat(i);
	}

}