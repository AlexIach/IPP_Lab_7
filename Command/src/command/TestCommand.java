/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/*The test class*/
public class TestCommand{
   public static void main(String[] args){
       Light l=new Light();
       Command switchUp=new TurnOnLightCommand(l);
       Command switchDown=new TurnOffLightCommand(l);

       Switch s=new Switch(switchUp,switchDown);
       
       s.flipUp();
       s.flipDown();
   }
}