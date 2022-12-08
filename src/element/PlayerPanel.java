package element ;
import java.awt.event.* ;
import java.io.File;
import java.io.IOException;
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
    Image img;
    Joueur player ;
    File file;
    Image im;
    ListenKey key ;
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

    public PlayerPanel(AllPanel pan ) {
        player= new Joueur() ;
        //key= new ListenKey(pan , this);
        this.setPreferredSize(new Dimension (500 ,500));
        file = new File("D:/java/game/src/img/girl/png/walk/walk1.png");
         img = new BufferedImage(player.getWidth(), player.getHeight(), BufferedImage.TYPE_INT_ARGB);
         try {
         img= ImageIO.read(file);
         } catch (IOException e) {
                e.printStackTrace();
          }
        
    }
    

    public void  draw (Graphics2D g){
        super.paint(g);
        this.player.x+=this.velocityX ;
        this.player.y+=this.velocityY;
        Graphics2D g2d = (Graphics2D) g;
       
        g2d.drawImage(img, player.getx(), player.gety(), player.getWidth(), player.getHeight(), this) ;

    }

    
}


  

    
 

    
 

    
