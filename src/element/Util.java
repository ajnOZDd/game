package element ;
public  class Util {

    public static final int idle=0;
    public static final int running=1;
    public static final int double_Jump=2;
    public static final int Jump=3;
    public static final int falling=4;
    public static final int hit=5 ;

    public static final int up = 0 ;
    public static final int down = 1 ;
    public static final int left = 2 ;
    public static final int right = 3 ;

    public static  int GetSpriteImage (int playerAction){
        switch (playerAction) {
            
            case running:
            return 12 ;
            case idle:

            return 11 ;

            case Jump: 

            case hit :
                return 7 ;

            default:
                return 1 ;
        
        }
    }
    
   
 
  
}