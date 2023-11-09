import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Clase que maneja practicamente toda la logica. Especialmente la clasificacion de basura
 * 
 * @author Rene Sebastian y Gerardo Fernandez
 * @version (a version number or a date)
 */
public class ClasifControll extends Actor
{    
    private int timer = 7250;
    
    public ClasifControll(){
        
    }
    
    /**
     * Act - do whatever the ClasifControll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    /**
     * Logica para saber si la basura fue puesta en el basurero correcto
     */
    public boolean IsClassificationCorrect(Actor waste, Bins bin, Juego juego){
        if(bin.getType() == 0){
            if( ((Waste)waste).isOrganic() ){
                addPoints(juego);
                return true;
            }
            SubstractPoints(juego);
            return false;
        }
        
        else if(bin.getType() == 1 && ((Inorganic)bin).isRecyclable()){
            if( !((Waste)waste).isOrganic() && ((Waste)waste).isRecycle() ){
                addPoints(juego);
                return true;
            }
            SubstractPoints(juego);
            return false;
        }
        
        else if (bin.getType() == 1 && !((Inorganic)bin).isRecyclable()){
            if( !((Waste)waste).isOrganic() && !((Waste)waste).isRecycle() ){
                addPoints(juego);
                return true;
            }
            SubstractPoints(juego);
            return false;
        }
        
        return false;
    }
    
    /**
     * Metodo que controla el sistema de vidas
     */
    public void checkLivesAndGameOver(Juego juego) {
        if (juego.getLives() == 0) {
            Greenfoot.playSound("WIN.mp3");
            Greenfoot.setWorld(new Game_Over(juego.getScore()));
        }
    }
    
    /**
     * Suma puntos cuando pone la basura en su lugar
     */
    public void addPoints(Juego juego){        
        int gameScore = juego.getScore();
        Greenfoot.playSound("CORRECT.mp3");
        juego.setScore(gameScore + 50);
    }
    
    /**
     * Pierde una vida cuando comete un error
     */
    public void SubstractPoints(Juego juego){
        int gameLives = juego.getLives();
        Greenfoot.playSound("WRONG.mp3");
        juego.setLives(gameLives - 1);
    }
    
    /**
     * Al obtener un desperdicio aleatorio con el controlador l�gico, el mundo agrega este nuevo objeto
     * cuando el m�dulo 120 del temporizador es igual a 0 (Cada 2 segundos)
     */
    public void SpawnNewWaste(World world) {
        timer--;
        if (timer % 120 == 0) {
            world.addObject(RandomWasteGenerator(), 10, 200);
        }
    }
    
    /**
     * Genera una basura al azar
     * devuelve un actor que varia dependiendo un numero al azar
     */
    public Actor RandomWasteGenerator(){
        int random = (int)Math.floor(Math.random()*(6-1+1)+1);
        Actor new_Waste;
        if(random == 1){
            new_Waste = new Aluminio();
            return new_Waste;
        }
        
        else if(random == 2){
            new_Waste = new BolsasPL();
            return new_Waste;
        }
        
        else if(random == 3){
            new_Waste = new Ceramica();
            return new_Waste;
        }
        
        else if(random == 4){
            new_Waste = new Electronicos();
            return new_Waste;
        }
        
        else if(random == 5){
            new_Waste = new Fruta();
            return new_Waste;
        }
        
        else if(random == 6){
            new_Waste = new PapelCarton();
            return new_Waste;
        }
        
        return null;
    }
}
