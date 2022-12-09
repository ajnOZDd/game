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
   ListenerMouse m ;

    public AllPanel (Affichage f){
    k= new ListenKey(this, panel);
    m=new ListenerMouse(this);
    panel= new PlayerPanel(this);
    background = new Background(this);
    this.setPreferredSize(new Dimension(500,400));
    setPanelSize() ;
   // time= new Timer(1000, k);
    this.setOpaque(true);
    this.f=f ;
    }
    
    public void setPanelSize() {
        Dimension dim = new Dimension (1280,800) ;
        this.setPreferredSize(dim);
    }

    public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D)g;
    panel.draw(g2d);
    setPanelSize();
    background.draw(g2d);
    f.addKeyListener(k);
    f.addMouseListener(m);
    f.addMouseMotionListener(m);
    g2d.dispose();
    }

}
