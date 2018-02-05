import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.NullPointerException;
import java.io.PrintStream;
/**
 * Smart class calculates intelligent moves for computer to play with the human. It inherits an abstract method from abstract class 
 * Computer player and implements it. It receives current marks on the buttons via makeMove() method and calculates smart moves based
 * on the conditions. 
 *
 * @Lala Rukh
 * @2018.01.07
 */
public class Smart extends ComputerPlayer {
 /**
  * Constructor for objects of class Smart
  */
 public Smart() {}

 /**
  * The method makeMove() receives current marked positions on the button grid in the form of an array list. It then checks values from
  * the array list and formulates its moves. It plays to win first, therefore if it finds two same O marks in same row, column or diagonal,
  * it returns value for the third one. After that, it plays to block opponent's win. It checks if the positions are blank before returning
  * the values. If none of the intelligent move is possible, it returns random position values.
  */
 public int[] makeMove(ArrayList < String > movesArray) {
  int y = 0;
  int z = 0;
  // Check rows for computer win conditions
  for (int a = 0, b = 1, c = 2, x = 0; a < 7; a = a + 3, b = b + 3, c = c + 3, x++) {
      
   if (movesArray.get(a) == "O" && movesArray.get(b) == "O") {
    
    if (movesArray.get(c) != "X" && movesArray.get(c) != "O") {
     return new int[] {x,2};
    }
   }
   else if (movesArray.get(b) == "O" && movesArray.get(c) == "O") {
   
    if (movesArray.get(a) != "X" && movesArray.get(a) != "O") {
     return new int[] {x,0};
    }
   }
   else if (movesArray.get(a) == "O" && movesArray.get(c) == "O") {
    
    if (movesArray.get(b) != "X" && movesArray.get(b) != "O") {
     return new int[] {x,1};
    } 
   }
  }
  //Check columns for computer win conditions
  for (int a = 0, b = 3, c = 6, x = 0; a < 3; a++, b++, c++, x++) {
   
   if (movesArray.get(b) == "O" && movesArray.get(c) == "O") {
    
    if (movesArray.get(a) != "X" && movesArray.get(a) != "O") {
     return new int[] {0,x};
    }
   }
   else if (movesArray.get(a) == "O" && movesArray.get(c) == "O") {
    
    if (movesArray.get(b) != "X" && movesArray.get(b) != "O") {
     return new int[] {1,x};
    }
   }
   else if (movesArray.get(a) == "O" && movesArray.get(b) == "O") {
    
    if (movesArray.get(c) != "X" && movesArray.get(c) != "O") {
     return new int[] {2,x};
    } 
   }
  }
  // Check diagonals for computer win conditions
  for (int a = 0, b = 4, c = 8, x = 2; a < 3; a = a + 2 , c = c - 2, x = x - 2) {
      
   if (movesArray.get(a) == "O" && movesArray.get(b) == "O") {
    
    if (movesArray.get(c) != "X" && movesArray.get(c) != "O") {
     return new int[] {2,x};
    }
   }
   else if (movesArray.get(b) == "O" && movesArray.get(c) == "O") {
    
    if (movesArray.get(a) != "X" && movesArray.get(a) != "O") {
     return new int[] {0,(- x) - (- 2)};
    }
   }
   else if (movesArray.get(a) == "O" && movesArray.get(c) == "O") {
    
    if (movesArray.get(b) != "X" && movesArray.get(b) != "O") {
     return new int[] {1,1};
    }
   }  
  } 
  // Check rows for blocking opponent's win
   for (int a = 0, b = 1, c = 2, x = 0; a < 7; a = a + 3, b = b + 3, c = c + 3, x++) {
   
   if (movesArray.get(a) == "X" && movesArray.get(b) == "X") {
    
    if (movesArray.get(c) != "X" && movesArray.get(c) != "O") {
     return new int[] {x,2};
    }
   }
   else if (movesArray.get(b) == "X" && movesArray.get(c) == "X") {
    
    if (movesArray.get(a) != "X" && movesArray.get(a) != "O") {
     return new int[] {x,0};
    }
   }
   else if (movesArray.get(a) == "X" && movesArray.get(c) == "X") {
   
    if (movesArray.get(b) != "X" && movesArray.get(b) != "O") {
     return new int[] {x,1};
    } 
   }
  }
  // Check columns for blocking opponent's win
  for (int a = 0, b = 3, c = 6, x = 0; a < 3; a++, b++, c++, x++) {
   
   if (movesArray.get(b) == "X" && movesArray.get(c) == "X") {
    
    if (movesArray.get(a) != "X" && movesArray.get(a) != "O") {
     return new int[] {0,x};
    }
   }
   else if (movesArray.get(a) == "X" && movesArray.get(c) == "X") {
    
    if (movesArray.get(b) != "X" && movesArray.get(b) != "O") {
     return new int[] {1,x};
    }
   }
   else if (movesArray.get(a) == "X" && movesArray.get(b) == "X") {
    
    if (movesArray.get(c) != "X" && movesArray.get(c) != "O") {
     return new int[] {2,x};
    } 
   }
  }
  //Check diagonals for blocking opponent's win
  for (int a = 0, b = 4, c = 8, x = 2; a < 3; a = a + 2 , c = c - 2, x = x - 2) {
   
   if (movesArray.get(a) == "X" && movesArray.get(b) == "X") {
       
    if (movesArray.get(c) != "X" && movesArray.get(c) != "O") {
     return new int[] {2,x};
    }
   }
   else if (movesArray.get(b) == "X" && movesArray.get(c) == "X") {
    
    if (movesArray.get(a) != "X" && movesArray.get(a) != "O") {
     return new int[] {0,(- x) - (- 2)};
    }
   }
   else if (movesArray.get(a) == "X" && movesArray.get(c) == "X") {
    
    if (movesArray.get(b) != "X" && movesArray.get(b) != "O") {
     return new int[] {1,1};
    }
   }  
  } 
  // Random play
    Random rand = new Random();
    int ri = rand.nextInt(3);
    int rj = rand.nextInt(3);
    return new int[] {ri,rj};
}
}