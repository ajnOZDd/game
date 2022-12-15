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
    int aniTick, aniIndex, aniSpeed=15 ;
    int nomEvenement ;
    int nombreexact;
    int playerAction;
    double playerSpeed =2.08 ;
    boolean up , right , left,down ; 
    Boolean mov =true ;
    public PlayerPanel(AllPanel pan ) {
        player= new entity() ;
        //key= new ListenKey(pan , this);
       //imageBasique();
    }
   
    
    public void loadImageIdle (int nombreexact){
    loading = new BufferedImage[GetSpriteCharacterImage(nombreexact)];
    img=LoadSave.mage(nombreexact, novementEvenement);
    for ( int i =0 ; i<loading.length ; i++){
    loading[i]=img.getSubimage(i*32, 0, 32, 32);   
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
    public void updateAnimationTick() {
        aniTick++;
        if (aniTick>=aniSpeed){
            aniTick=0 ;
            aniIndex++;
            if (aniIndex>=GetSpriteCharacterImage(playerAction)){
                aniIndex=0 ;
                
            }
        }
    }

    
    public void setMov(Boolean mov) {
        this.mov = mov;
    }
    public void Animation (){
        if (mov){
            playerAction=running ;
            

        }
        if(mov==false){
            playerAction=idle ;

        }
    }
    public void gamepos(){
        mov=false ;
        if (left && !right){
        this.player.x-= playerSpeed ;     
             mov=true ;
        }else if (!left && right){
            this.player.x+= playerSpeed ;
            mov=true ;
        }
        if (up && !down){
            this.player.y-= playerSpeed ;
            mov=true ;
        }else if (!up && down){
            this.player.y+= playerSpeed ;
            mov=true ;
        }

        
    }
    public void gameUpdate (){
        gamepos();
        updateAnimationTick();
        Animation();

    }
    private void resetBoolean() {
        right=false ;
        left=false ;
        up=false ;
        down=false ;
    }
    public void windowlost (){
        this.resetBoolean() ;
    }
   
    public void  draw (Graphics g){
        super.paintComponent(g);
        loadImageIdle(playerAction);
        g.drawImage(loading[aniIndex], player.x, player.y, player.getWidth(), player.getHeight(), this) ;
        
        
    }


    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {
        this.position = position;
    }


    public double getTimeChange() {
        return timeChange;
    }


    public void setTimeChange(double timeChange) {
        this.timeChange = timeChange;
    }


    public int getFrames() {
        return frames;
    }


    public void setFrames(int frames) {
        this.frames = frames;
    }


    public long getLastCheck() {
        return lastCheck;
    }


    public void setLastCheck(long lastCheck) {
        this.lastCheck = lastCheck;
    }


    public int getCountImageFRame() {
        return countImageFRame;
    }


    public void setCountImageFRame(int countImageFRame) {
        this.countImageFRame = countImageFRame;
    }


    public AllPanel getPan() {
        return pan;
    }


    public void setPan(AllPanel pan) {
        this.pan = pan;
    }


    public entity getPlayer() {
        return player;
    }


    public void setPlayer(entity player) {
        this.player = player;
    }


    public File getFile() {
        return file;
    }


    public void setFile(File file) {
        this.file = file;
    }


    public BufferedImage getImg() {
        return img;
    }


    public void setImg(BufferedImage img) {
        this.img = img;
    }


    public BufferedImage getSubImage() {
        return subImage;
    }


    public void setSubImage(BufferedImage subImage) {
        this.subImage = subImage;
    }


    public InputStream getIs() {
        return is;
    }


    public void setIs(InputStream is) {
        this.is = is;
    }


    public BufferedImage[] getLoading() {
        return loading;
    }


    public void setLoading(BufferedImage[] loading) {
        this.loading = loading;
    }


    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }


    public String[] getNovementEvenement() {
        return novementEvenement;
    }


    public void setNovementEvenement(String[] novementEvenement) {
        this.novementEvenement = novementEvenement;
    }


    public int getAniTick() {
        return aniTick;
    }


    public void setAniTick(int aniTick) {
        this.aniTick = aniTick;
    }


    public int getAniIndex() {
        return aniIndex;
    }


    public void setAniIndex(int aniIndex) {
        this.aniIndex = aniIndex;
    }


    public int getAniSpeed() {
        return aniSpeed;
    }


    public void setAniSpeed(int aniSpeed) {
        this.aniSpeed = aniSpeed;
    }


    public int getNomEvenement() {
        return nomEvenement;
    }


    public void setNomEvenement(int nomEvenement) {
        this.nomEvenement = nomEvenement;
    }


    public int getNombreexact() {
        return nombreexact;
    }


    public void setNombreexact(int nombreexact) {
        this.nombreexact = nombreexact;
    }


    public int getPlayerAction() {
        return playerAction;
    }


    public void setPlayerAction(int playerAction) {
        this.playerAction = playerAction;
    }


    public boolean isUp() {
        return up;
    }


    public void setUp(boolean up) {
        this.up = up;
    }


    public boolean isRight() {
        return right;
    }


    public void setRight(boolean right) {
        this.right = right;
    }


    public boolean isLeft() {
        return left;
    }


    public void setLeft(boolean left) {
        this.left = left;
    }


    public boolean isDown() {
        return down;
    }


    public void setDown(boolean down) {
        this.down = down;
    }


    public Boolean getMov() {
        return mov;
    }
    



    
}


  

    
 

    
 

    
