package element;

import org.w3c.dom.css.Counter;

public class Enemy extends Effet {
    int width ;
    int height ;
    int x ;
    int y ;
    double PointVie ;
    double attack ;
    double vitesse ;
    int Count = 3 ;
    String nomEnemy ;
    double puissance  ;
    int level ;
    int taille ;
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
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
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    
}
