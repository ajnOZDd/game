package element;
import java.awt.*;
public class entity {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    int running ;
    int width = 80;
    int height = 81 ;
    int x;
    int y= (int)this.size.getHeight()/2;
    double PointVie ;
    double attack ;
    double vitesse ;
    String nomJoueur ;
    int level ;
    int taille ;
    int tomber ;
    int saut ;
    int attack_saut1 ;
    int attack_saut2 ;
    
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
    public int getSpritAmount (int Action_Joueur){
        return Action_Joueur ;
    }
}
