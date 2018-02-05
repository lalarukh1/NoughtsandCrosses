import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
/**
 * ComputerPlayer class is responsible for returning moves for computer player to play on the button grid. It consists of an abstract 
 * method makeMove() that is implemented by two of it's sub classes. ComputerPlayer is the parent class.
 *
 * @Lala Rukh
 * @2018.01.07
 */
public abstract class ComputerPlayer
{
 /**
 Constructor for ComputerPlayer class
 */
 public ComputerPlayer(){}
 /**
 Abstract method definition for ComputerPlayer class
 */      
 abstract int[] makeMove(ArrayList<String> movesArray);
}