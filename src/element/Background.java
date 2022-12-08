package element;

import javax.swing.JPanel;
import java.awt.*;
public class Background extends JPanel {
    AllPanel pan2 ;
    public Background (AllPanel pan2){
        this.pan2=pan2 ;
    }
    public void draw (Graphics2D g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(200, 15, 10, 10);
        g2d.setBackground(Color.BLACK);
    }
    
}
