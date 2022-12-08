package element;
import java.awt.*;
public class Joueur {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    int width = 50 ;
    int height = 51 ;
    int x ;
    int y=(int)size.getHeight()/2;
    double PointVie ;
    double attack ;
    double vitesse ;
    String nomJoueur ;
    double puissance  ;
    int level ;
    int taille ;
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
    public void setx(int x) {
        this.x = x;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getx() {
        return x;
    }
    public void sety(int y) {
        this.y = y;
    }
    public int gety() {
        return y;
    }
    public double getPointVie() {
        return PointVie;
    }
    public void setPointVie(double pointVie) {
        PointVie = pointVie;
    }
    public double getAttack() {
        return attack;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public double getVitesse() {
        return vitesse;
    }
    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }
    
    public String getNomJoueur() {
        return nomJoueur;
    }
    public void setNomEnemy(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }
    public double getPuissance() {
        return puissance;
    }
    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
}
