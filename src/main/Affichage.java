package main;

import javax.swing.JFrame;
import javax.swing.border.Border;

import element.AllPanel;
import element.Background;
import element.ListenKey;
import element.ListenerMouse;
import element.PlayerPanel;
import element.Focus;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Affichage extends JFrame implements Runnable{
    int WIDTH=500;
    int HEIGHT=250;
    PlayerPanel pane ;
    AllPanel pan ;
    Background background ;
    ListenKey key  ;
    ListenerMouse mouse ;
    Thread gamethread ;
    Focus focus ;
    double timeChange = 0;
    int fps_set=120 ;
    int set_ups =200 ;
    int updates=0 ;
    int frames=0 ;
    public Affichage (){

    pan = new AllPanel(this) ;
    key = new ListenKey(pan) ;
    mouse = new ListenerMouse(pan);
    pane= new PlayerPanel(pan) ;
    focus = new Focus(pan) ;
    //this.getContentPane().setBackground(Color.BLACK);
    this.add(pan);
    this.addKeyListener(key);
    this.addMouseListener(mouse);
    this.addWindowFocusListener(focus);
    this.addMouseMotionListener(mouse);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setFocusable(true);
    this.setLocationRelativeTo(null);
    startGameloop();
    }
    
    
    public void startGameloop (){
        gamethread= new Thread(this) ;
        gamethread.start();
    }
    
    
    public void update(){
        pan.getPanel().gameUpdate();
     }
    @Override
    public void run() {
        double timeFrame =1000000000.0/fps_set ;
        double timeUpdate =1000000000.0/set_ups ;
        long previoustime= System.nanoTime() ;
        long lastCheck=System.currentTimeMillis() ;
        double upt=0 ;
        double fra=0 ;
        
        while(true){
            long currentTime=System.nanoTime();
            upt+=(currentTime-previoustime)/timeUpdate ;
            fra+=(currentTime-previoustime)/timeFrame ;
            previoustime=currentTime ;
            if (upt>=1){
                update();
                updates++;
                upt-- ;
            }
            if (fra>=1){
                pan.repaint();
                frames++;
                fra-- ;

            }
            
        if(System.currentTimeMillis()-lastCheck>=1000){
            lastCheck=System.currentTimeMillis() ;
           // System.out.println("fps:"+frames+ "||"+"ups:"+updates);
            frames=0;
            updates=0 ;
        }

        }
        
        
        
    }
     public static void main(String[] args) {
        Affichage affichage = new Affichage();
    }
}
