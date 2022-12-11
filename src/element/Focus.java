package element;
import java.awt.event.* ;
public class Focus implements WindowFocusListener{
    AllPanel panini ;
    public Focus (AllPanel panini){
        this.panini= panini ;
    }
    @Override
    public void windowGainedFocus(WindowEvent e) {
       
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        System.out.println("nop");
        panini.panel.windowlost () ;
        
        
    }
}
