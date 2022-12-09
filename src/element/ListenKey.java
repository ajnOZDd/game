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
        super.keyPressed(e);

        if (e.getKeyChar()=='d'){
            pani.panel.setVelocityX(10);
            this.pani.panel.player.x+=this.pani.panel.velocityX;

        }

        
        if (e.getKeyChar()=='q'){
            pani.panel.setVelocityX(10);
            this.pani.panel.player.x-=this.pani.panel.velocityX;
        }
        if (e.getKeyChar()=='s'){
            pani.panel.player.setx(5);
            pani.panel.setLocation(pani.panel.player.getx()-1, pani.panel.player.y);
            System.out.println(pani.panel.player.x);
        }
       

    }
   
    
}
