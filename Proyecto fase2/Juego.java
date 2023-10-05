import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Screen, were the clasification of different Waste Objects are made
 * 
 * @author Ricardo Chuy
 * @version (a version number or a date)
 */
public class Juego extends World
{
    private int timer = 7250;
    private int score;
    private ClasifControll Controller = new ClasifControll();
    
    /**
     * Constructor for objects of class Juego.
     * 
     */
    public Juego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        setScore(0);
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int thescore){
        score = thescore;
    }
    
    /**
     * Act method that checks every fram to shoe the time, score, spawn new waste and change screen when 
     * the time reaches 0
     */
    public void act()
    {
        ShowTimer();
        ShowScore();
        SpawnNewWaste();
        if (timer <= 0) {
            Greenfoot.playSound("WIN.mp3");
            Greenfoot.setWorld(new Game_Over(score));
        }
    }
    
    /**
     * Method to show the time that is left, only when module 60
     * of the time is equal to 0 (60 frames in 1 second).
     */
    public void ShowTimer(){
        timer--;
        if (timer % 60 == 0){
            showText("Tiempo: "+ timer / 60, 50, 50);
        }
    }
    
    /**
     * Method to show score
     */
    public void ShowScore(){
        showText("Puntos: "+ score, 540, 50);
    }
    
    /**
     * By getting a random waste with the logic controller, the world adds this new objecto
     * when the module 120 of timer equals 0 (Every 2 seconds)
     */
    public void SpawnNewWaste(){
        Actor random_Waste = Controller.RandomWasteGenerator();
        if (timer % 120 == 0){
            addObject(random_Waste,10,200);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Organic organic = new Organic();
        addObject(organic,150,289);

        Recyclable recyclable = new Recyclable();
        addObject(recyclable,411,290);

        NonRecyclable nonRecyclable = new NonRecyclable();
        addObject(nonRecyclable,318,292);

        organic.setLocation(550,340);
        showText(""+ organic.getLabel(), organic.getX(), organic.getY());
        
        recyclable.setLocation(440,340);
        showText(""+ recyclable.getLabel(), recyclable.getX(), recyclable.getY());
        
        nonRecyclable.setLocation(310,340);
        showText(""+ nonRecyclable.getLabel(), nonRecyclable.getX(), recyclable.getY());
        }
}
