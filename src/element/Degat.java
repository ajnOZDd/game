package element;

public class Degat extends Status {
    int count=0 ;

    Effet effect = new Effet();
    double puissance =0 ;
    double vitesse =0;
    int tauxNourritureMange = 4 ;
    int tauxEauxBuu =4 ;
    int [] Niveaufatigue ={1,2,3,4} ; 

    double pointVieImpact (){
    for (int i=0; i<Niveaufatigue.length ;i++){
    pointVie= puissance * vitesse-Niveaufatigue[i]/2;
    }
    return pointVie ;
    }

    void ressources (){
    
     if (tauxEauxBuu<=15 || tauxNourritureMange<=15 ){
        count=+1 ;
        System.out.println( "la sante de votre joueur est descendue") ;
        Niveaufatigue[count] = count+1 ;
        System.out.println(effect.etat()[count]); 
        if (tauxEauxBuu<4 && tauxNourritureMange<4 ){
            Niveaufatigue[count] = count+1;
            System.out.println( "la sante de votre joueur est critique") ;
            System.out.println(effect.etat()[count-1]) ;
            System.out.println(effect.etat()[count]) ;
    
        }
     }
     
     
    }
    void degat (){
    if (pointVie<=10){
    System.out.println("le joueur doit se regenerer immediatement") ;
    }
    }
    public Degat (){
    ressources();
    }

   
}
