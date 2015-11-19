/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/*	Игра "Монополия". Специфически только для монополии реализует методы класса Game.
 *
 *      Файл Monopoly.java
 * */

public class Monopoly extends Game{

    public Monopoly() {
        System.err.println("Monopoly Game");
    }

    
	@Override
	protected void initializeGame() {
		// monopoly specific initialization actions
	}

	@Override
	protected void playGame() {
		// monopoly specific play actions
	}

	@Override
	protected void endGame() {
		// monopoly specific actions to end a game
	}

	@Override
	protected void printWinner() {
		// monopoly specific actions to print winner
	}

}