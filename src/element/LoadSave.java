package element;
import java.awt.image.* ;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;

import javax.imageio.ImageIO;

import main.Affichage;
import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;
import static element.level.width;
import static element.level.height;

public class LoadSave  {
   
  
   static int value;

public static  BufferedImage mage (int PlayerAction, String [] novementEvenement){
     BufferedImage img =null ;
     InputStream  is =LoadSave.class.getResourceAsStream("../Free/Main Characters/Ninja Frog/"+novementEvenement[PlayerAction]);
     
    try {
        img = ImageIO.read(is) ;
        
    } catch (IOException e) {
        System.out.println("sorry");
    }finally {
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 }
 return img ;
}

public static  BufferedImage background ( String  novementEvenement){
    BufferedImage img =null ;
    InputStream  is =LoadSave.class.getResourceAsStream("../Free/Main Characters/Ninja Frog/"+novementEvenement+".png");
    
   try {
       img = ImageIO.read(is) ;
       
   } catch (IOException e) {
       System.out.println("sorry");
   }finally {
       try {
           is.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
}
return img ;
}

public static int[][] getLevelData (){
    int [][] leveldata = new int [level.width][level.height] ;
    BufferedImage img = background("Terrain (16x16)");
    for (int i = 0; i<img.getWidth(); i++){
        for (int j = 0 ; j<img.getHeight();j++){
              Color col = new Color(img.getRGB(i, j));
              if (value >48){
                value=0 ;
              }
              leveldata[i][j]= col.getRed() ;
        }
    }
    return leveldata ;
}
}
