// Aqui es donde el juego comienza y donde podremos empezar a ver como las vidas conforme avanza si pierdes iran bajando.
import greenfoot.*;
import javax.swing.JOptionPane;

public class Juego extends World {
    private int timer = 7250;
    private int score;
    private int vidas = 3;  // Nuevo contador de vidas
    public static String name = null;
    private ClasifControll Controller = new ClasifControll();
    private boolean nameRequested = false;

    public Juego() {
        super(900, 600, 1);
        if (!nameRequested && name == null) {
            name = JOptionPane.showInputDialog("Ingrese su nombre");
            nameRequested = true;
        }
        prepare();
        setScore(0);
        showLives();  // Muestra las vidas al iniciar el juego
    }

    public int getScore() {
        return score;
    }

    public void setScore(int thescore) {
        score = thescore;
    }

    public void act() {
        prepare();
        ShowTimer();
        ShowScore();
        SpawnNewWaste();
        if (timer <= 0 || vidas <= 0) {
            Greenfoot.playSound("WIN.mp3");
            Greenfoot.setWorld(new Game_Over(score));
        }
    }

    public void ShowTimer() {
        timer--;
        if (timer % 60 == 0) {
            showText("Tiempo: " + timer / 60, 50, 50);
        }
    }

    public void ShowScore() {
        showText("Puntaje: " + score, 750, 125);
    }

    public void SpawnNewWaste() {
        Actor random_Waste = Controller.RandomWasteGenerator();
        if (timer % 120 == 0) {
            addObject(random_Waste, 10, 200);
        }

        // Lógica de reducción de vidas
        if (Greenfoot.mouseClicked(random_Waste)) {
            reduceLife();
        }
    }

    // Nueva función para reducir vidas
    public void reduceLife() {
        vidas--;
        if (vidas <= 0) {
            Greenfoot.playSound("LOST.mp3");
            Greenfoot.setWorld(new Game_Over(score));
        }
    }

    private void prepare() {
        Organic organic = new Organic();
        addObject(organic, 150, 289);

        Recyclable recyclable = new Recyclable();
        addObject(recyclable, 411, 290);

        NonRecyclable nonRecyclable = new NonRecyclable();
        addObject(nonRecyclable, 318, 292);

        organic.setLocation(630, 400);
        showText("" + organic.getLabel(), organic.getX(), organic.getY());

        recyclable.setLocation(440, 400);
        showText("" + recyclable.getLabel(), recyclable.getX(), recyclable.getY());

        nonRecyclable.setLocation(250, 400);
        showText("" + nonRecyclable.getLabel(), nonRecyclable.getX(), recyclable.getY());
    }

    private void showLives() {
        Lives vida = new Lives();
        vida.getImage().scale(vida.getImage().getWidth() / 5, vida.getImage().getHeight() / 5);
        addObject(vida, 748, 85);  // Nuevas coordenadas

        GreenfootImage textImage = new GreenfootImage("Vidas: " + vidas, vida.getImage().getWidth(), Color.WHITE, null);
        textImage.scale(textImage.getWidth() / 5, textImage.getHeight() / 5);
        getBackground().drawImage(textImage, 710 + vida.getImage().getWidth() / 2 + textImage.getWidth() / 2 + 10, 95);
    }
}










