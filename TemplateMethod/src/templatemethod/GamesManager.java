/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/*	Класс, показывающий работу шаблона проектирования "Шаблонный метод".
 *
 *      Файл GamesManager.java
 * */

public class GamesManager {

	public static void main (String [] args){
		final GameCode gameCode = GameCode.CHESS;
		
		Game game;
		
		switch (gameCode){
			case CHESS : 
				game = new Chess();  
				break;
			case MONOPOLY : 
				game = new Monopoly();  
				break;
			default :
				throw new IllegalStateException();
		}
		
		game.playOneGame(2);
	}
	
}