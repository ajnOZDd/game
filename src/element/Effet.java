package element;

public class Effet  {
    String [] etat = {"le joueur est stable" , "le joueur doit manger ou le joueur doit  boire de l'eau" ,"le joueur est fatigué" ,"le joueur est decédé"} ;
    String nomAttribut ;
    double [] pointAttribue ={1, 2.5 , 6 , 1.2};
    String [][] nomAttribue = {{"ball morte" , "lenteur" , "paralysie"} , {"rapiditéx2" ,"voleDePoint" , "invulnerabilite" , "degatInversé"}} ;
    String [][] effetAttribue ={{"deces du personnage:" ,"lenteur:" ,"l"} ,{"vitesse augmente de:" ,"point augmente de :" ,"invulnerabite de" , "point de vie augmente de"}} ;
   
    String [][] nomEffet (String nomAttribut){
        for (int i = 0; i < nomAttribue.length ;i++){
            if (nomAttribut==nomAttribue[0][i]){
              System.out.println (effetAttribue[0][i]);
            }
            if (nomAttribut == nomAttribue[1][i]){
              System.out.println (effetAttribue[1][i]+pointAttribue[i]);
            }
        }
        return nomAttribue ;
    }

    String [] etat (){
    return etat ;
    }
}
