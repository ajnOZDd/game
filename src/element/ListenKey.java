package element;
import javax.imageio.ImageIO;
import javax.swing.KeyStroke;
import javax.swing.text.Position;
import javax.swing.text.JTextComponent.KeyBinding;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class ListenKey extends KeyAdapter {
    AllPanel pani ;
    int i ;
    PlayerPanel pan ;
    public ListenKey (AllPanel pani, PlayerPanel pan){
        this.pani=pani ;
        this.pan=pan ;
    }
    @Override
    public void keyPressed(KeyEvent e) {
        super.keyTyped(e);

        if (e.getKeyChar()=='d'){
            pani.panel.player.x+=1 ;
        }
        
        if (e.getKeyChar()=='q'){
            
        }
        if (e.getKeyChar()=='s'){
            pani.panel.player.setx(5);
            pani.panel.setLocation(pani.panel.player.getx()-1, pani.panel.player.y);
            System.out.println(pani.panel.player.x);
        }
       

    }
   
    
}
