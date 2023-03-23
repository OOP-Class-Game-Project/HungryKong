//This line indicates that the class KeyHandler is part of the package Main.
package Main;

//These two lines import the KeyEvent and KeyListener classes from the java.awt.event package. These classes are needed to handle keyboard events.
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//This line declares a new public class called KeyHandler that implements the KeyListener interface. This means that the class will provide methods to handle keyboard events.
public class KeyHandler implements KeyListener{

public boolean 
  
  public void keyTyped(KeyEvent e){
  
  }
  
  /*This method is called when a key is typed (pressed and released). 
  It takes a KeyEvent object as a parameter, but in this implementation, it doesn't do anything.*/
  public void keyPressed(KeyEvent e){
    int code = e.getKeyCode();
    
    if(code == KeyEvent.VK_W){
      upPressed = true;
    }
    
    if(code == KeyEvent.VK_S){
          downPressed = true;

    }
    
    if(code == KeyEvent.VK_A){
          leftPressed = true;

    }
    
    if(code == KeyEvent.VK_D){
          rightPressed = true;

    }
  }
  
  /*This method is called when a key is released (after being pressed down). 
  It takes a KeyEvent object as a parameter and extracts the key code of the released key using the getKeyCode() method. 
  Then it sets the appropriate boolean variable (upPressed, downPressed, leftPressed, or rightPressed) to false based on the key that was released.*/
  
  public void keyReleased(KeyEvent e){
    int code = e.getKeyCode();
      if(code == KeyEvent.VK_W){
          upPressed = false;
    }
    
    if(code == KeyEvent.VK_S){
          downPressed = false;

    }
    
    if(code == KeyEvent.VK_A){
          leftPressed = false;

    }
    
    if(code == KeyEvent.VK_D){
          rightPressed = false;

    }
    
  }
}
