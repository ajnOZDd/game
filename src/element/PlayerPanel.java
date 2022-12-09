package element ;
import java.awt.event.* ;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import  javax.imageio.ImageIO ;
public class PlayerPanel extends JPanel  {
    int position=1 ;
    int velocityX ;
    double timeChange = 0;
    int frames ;
    long lastCheck=0 ;
    AllPanel pan ;
    Joueur player ;
    File file;
    BufferedImage img, subImage;
    ListenKey key ;
    public PlayerPanel(AllPanel pan ) {
        player= new Joueur() ;
        //key= new ListenKey(pan , this);
        getImage();
    }
    
    private void getImage() {
    InputStream is = getClass().getResourceAsStream("../Free/Main Characters/Ninja Frog/Idle (32x32).png");
    try {
      img = ImageIO.read(is) ;
    } catch (IOException e) {
      e.printStackTrace();
    }
    }
    public void setImagePosition(int x , int y) {
        player.x=x ;
        player.y=y ;
    }
    
    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    int velocityY;
    
    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public void  draw (Graphics2D g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        arrets();
        //System.out.println(this.player.size.getWidth());
       // player.x+=velocityX;
        //player.y+=velocityY;
        //System.out.println(player.x);
        subImage = img.getSubimage(0, 0, 32, 32);
        g2d.drawImage(subImage, player.getx(), player.gety(), player.getWidth(), player.getHeight(), this) ;
      
    }

    public void arrets (){
        if (this.player.x<0 || this.player.x>1400){
         this.player.x-=1 ;
         //System.out.println(this.player.x);
        }
        if (this.player.y<0 || this.player.y>700){
        this.player.y-=1 ;
       // System.out.println(this.player.y);

        }

    }
}


  

    
 

    
 

    
