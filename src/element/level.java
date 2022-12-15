package element;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import static element.Util.*;
public class level extends JPanel {
    AllPanel pan2 ;
    BufferedImage img ;
    InputStream input ;
    ObjectElement element ;
    int aniTick, aniIndex, aniSpeed=8 ;
    static int width ;
    static int height ;
    BufferedImage [] stream ;
    int [][] leveldata ;
    public level (int [][]leveldata,AllPanel pan2){
        //element = new ObjectElement() ;
        this.leveldata=leveldata ;
        
    }
    public int getIndex (int x , int y){
        return leveldata[x][y];
    }
   
}