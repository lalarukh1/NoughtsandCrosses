import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
/**
 * Naive class inherits an abstract method makeMove() from abstractparent class ComputerPlayer and implements it. It returns random moves 
 * to play against human player.
 *
 * @Lala Rukh
 * @2018.01.07
 */
public class Naive extends ComputerPlayer {
 /**
  * Constructor for objects of class Naive
  */
 public Naive() {

 }
 /**
  * makeMove method receives current positions on the button grid in the form of array list. It then generates random value pairs and 
  * return those values.
  */
 public int[] makeMove(ArrayList < String > movesArray) {
  movesArray.get(0);
  Random rand = new Random();
  int ri = rand.nextInt(3);
  int rj = rand.nextInt(3);
  return new int[] {ri,rj};
 }
}