package element;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;
import element.PlayerPanel;
import main.Affichage;
public class AllPanel extends JPanel {
   PlayerPanel panel ;
    level background ;
    Affichage f ;
    Timer time ;
   ListenKey k ;
   ListenerMouse m ;
   Dimension dim ;

    public AllPanel (Affichage f){
    k= new ListenKey(this);
    m=new ListenerMouse(this);
    panel= new PlayerPanel(this);
    //background = new Back(this);
    setPanelSize() ;
    dim = new Dimension (1080,720) ;
    this.setPreferredSize(dim);
    //System.out.println(f.getGame_width() +"||"+f.getGame_height() );

   // time= new Timer(1000, k);
    this.setOpaque(true);
    this.f=f ;
    }
    
    public void setPanelSize() {
    }

    
    public PlayerPanel getPanel() {
        return panel;
    }
    public level getBack() {
        return background;
    }
    public void setPanel(PlayerPanel panel) {
        this.panel = panel;
    }
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D)g;
 //..
  //background.draw(g2d);
   panel.draw(g2d);
    g2d.dispose();
    
    }


}
