package affichage;

import javax.swing.JFrame;
import javax.swing.border.Border;

import java.awt.*;

import element.AllPanel;
import element.Background;
import element.ListenKey;
//import element.ListenKey;
import element.ListenerMouse;
import element.PlayerPanel;

public class Affichage extends JFrame implements Runnable {
    int WIDTH=500;
    int HEIGHT=250;
    PlayerPanel pane ;
    AllPanel pan ;
    Background background ;
    ListenKey key  ;
    Thread gamethread ;
    double timeChange = 0;
    int frames =0 ;
    long lastCheck=0 ;
    int fps_set=120 ;
    public Affichage (){
    //key = new ListenKey(pan, pane) ;
   // pane= new PlayerPanel(pan) ;
    pan = new AllPanel(this) ;

   // this.addKeyListener(key);
    //this.getContentPane().setBackground(Color.BLACK);
    this.add(pan);
    //this.add(pane);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setFocusable(true);
    this.setLocationRelativeTo(null);
    startGameloop();
    }
    public static void main(String[] args) {
        Affichage affichage = new Affichage();
    }
    public void startGameloop (){
        gamethread= new Thread(this) ;
        gamethread.start();
    }
    @Override
    public void run() {
        double timeFrame =1000000000.0/fps_set ;
        long lastframe= System.nanoTime() ;
        long now = System.nanoTime() ;
        while(true){
           
            now=System.nanoTime() ;
            if(now-lastframe>=timeFrame){
                pan.repaint();
                lastframe=now ;
                frames++;

            }
        if(System.currentTimeMillis()-lastCheck>=1000){
            lastCheck=System.currentTimeMillis() ;
            System.out.println("fps:"+frames);
            frames=0;
        }
        }
        
        
    }
}
