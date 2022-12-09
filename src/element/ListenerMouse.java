package element ;
import java.awt.event.*;
public class ListenerMouse extends MouseAdapter{
    AllPanel pan;
    public ListenerMouse (AllPanel pan){
    this.pan=pan;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
       // System.out.println("yes");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        //System.out.println(e.getX());
        
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        pan.panel.setImagePosition(e.getX(), e.getY());
    }
}