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
        System.out.println("oui enconre");
    }
    @Override
    public void mouseDragged(MouseEvent e) {
       
    }
    
    public void mouseMoved(MouseEvent e) {
        
    }
}