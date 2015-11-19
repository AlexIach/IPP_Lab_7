/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/*	Игра "Шахматы". Специфически только для шахмат реализует методы класса Game.
 *
 *      Файл Chess.java
 * */

public class Chess extends Game {

    public Chess() {
        System.err.println("Chess Game");
    }
    

	@Override
	protected void initializeGame() {
		// chess specific initialization actions
	}

	@Override
	protected void playGame() {
		// chess specific play actions
	}

	@Override
	protected void endGame() {
		// chess specific actions to end a game
	}

	@Override
	protected void printWinner() {
		// chess specific actions to print winner
	}

}
