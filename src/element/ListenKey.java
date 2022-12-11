package element;
import javax.imageio.ImageIO;
import javax.swing.KeyStroke;
import javax.swing.text.Position;
import javax.swing.text.JTextComponent.KeyBinding;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import static element.Util.*;;
public class ListenKey extends KeyAdapter {
    AllPanel pani ;
    int i ;

    public ListenKey (AllPanel pani){
        this.pani=pani ;
    }
    @Override 
    public void keyReleased (KeyEvent e){
        super.keyReleased(e);
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
            pani.panel.setUp(false);
           
            
            case KeyEvent.VK_DOWN:
           
            pani.panel.setDown(false);
            
            case KeyEvent.VK_LEFT:
            pani.panel.setLeft(false);
            
            case KeyEvent.VK_RIGHT:
            pani.panel.setRight(false);
            break ;
    }
 }
    @Override
    public void keyTyped (KeyEvent e){
        super.keyTyped(e);
       
    }
    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
            pani.panel.setUp(true);
            break ;
            case KeyEvent.VK_DOWN:
            pani.panel.setDown(true);
            break ;
            case KeyEvent.VK_LEFT:
            pani.panel.setLeft(true);
            break ;
            case KeyEvent.VK_RIGHT:
            pani.panel.setRight(true);
            break ;
    }
            
            
        }
       

    }
   
    

