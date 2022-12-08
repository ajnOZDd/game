package element;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.Timer;
import affichage.Affichage;
import java.awt.*;
import element.PlayerPanel;
public class AllPanel extends JPanel {
   PlayerPanel panel ;
    Background background ;
    Affichage f ;
    Timer time ;
   ListenKey k ;
    public AllPanel (Affichage f){
    k= new ListenKey(this, panel);
    panel= new PlayerPanel(this);
    background = new Background(this);
    this.setPreferredSize(new Dimension(500,400));
   // time= new Timer(1000, k);
    this.setOpaque(true);
    this.f=f ;
    }
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D)g;
    panel.draw(g2d);
    background.draw(g2d);
    g2d.dispose();
    f.addKeyListener(k);
    }

}
