package element ;
import java.awt.event.* ;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import  javax.imageio.ImageIO ;
import static element.Util.*;
public class PlayerPanel extends JPanel  {
    int position=1 ;
    int velocityX ;
    double timeChange = 0;
    int frames ;
    long lastCheck=0 ;
    int countImageFRame =11;
    AllPanel pan ;
    entity player ;
    File file;
    BufferedImage img, subImage;
    InputStream is;
    BufferedImage [] loading ;
    int number;
    String [] novementEvenement = {"Idle (32x32).png","Run (32x32).png","Double Jump (32x32).png", "Jump (32x32).png","Fall (32x32).png", "Hit (32x32).png",  } ;
    ListenKey key ;
    int aniTick, aniIndex, aniSpeed=8 ;
    int nomEvenement ;
    int playerAction =running;
    public PlayerPanel(AllPanel pan ) {
        player= new entity() ;
        //key= new ListenKey(pan , this);
        getImageBasique();
    }
    
    private void getImageBasique() {
    is =getClass().getResourceAsStream("../Free/Main Characters/Ninja Frog/"+novementEvenement[0]);
    try {
      img = ImageIO.read(is) ;
    } catch (IOException e) {
      e.printStackTrace();
    }
    }
    public void loadImageIdle ( int nombreexact){
    is =getClass().getResourceAsStream("../Free/Main Characters/Ninja Frog/"+novementEvenement[nombreexact]);
    try {
        img = ImageIO.read(is) ;
    } catch (IOException e) {
        e.printStackTrace();
    }
    loading = new BufferedImage[GetSpriteImage(playerAction)];
    for ( int i =0 ; i<loading.length ; i++){
     loading[i]=img.getSubimage(i*32, 0,32, 32);
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
    private void updateAnimationTick() {
        aniTick++;
        if (aniTick>=aniSpeed){
            aniTick=0 ;
            aniIndex++;
            if (aniIndex>=loading.length){
                aniIndex=0 ;
            }
        }
    }
    public void arrets (){
        if (this.player.x<0 ){
         this.player.x=-1 ;
         //System.out.println(this.player.x);
        }else{
            if ( this.player.x>1100 && this.player.y>500){
                this.player.x=1400 ;
            }
        }
       

    }
    public void  draw (Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        arrets();
        updateAnimationTick();
        loadImageIdle( playerAction);
        g2d.drawImage(loading[aniIndex], player.x, player.y, player.getWidth(), player.getHeight(), this) ;
      
    }

    
}


  

    
 

    
 

    
