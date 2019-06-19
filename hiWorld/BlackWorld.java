import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackWorld here.
 * 
 * @tatatingting (your name) 
 * @v1.2
 * 2019-05-21 (a version number or a date)
 */


public class BlackWorld extends World
{

    /**
     * Constructor for objects of class BlackWorld.
     * 
     */
    public WhiteWalker apple = new WhiteWalker();
    
    public BlackWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        // image
        setBackground("space1.jpg");
        prepare();

    }
    
    public void prepare() {
        
        // fill color
        // GreenfootImage background = getBackground();
        // background.setColor(Color.BLUE);
        // background.fill();
        
        // image + text
        GreenfootImage background = getBackground();
        // title
        background.setColor(Color.BLUE);
        background.setFont(new Font(true, true, 25));
        //background.drawString("Crazy Apple In Black《暗黑疯苹果》", 20, 20);
        background.drawString("Apple Odyssey《暗黑疯苹果》", 20, 30);
        // hint
        showText("press 'SPACE' key to speed up",400, 370);
        // GOAL
        background.setColor(Color.RED);
        background.fillRect(250, 100, 50, 100);
        
        // add object
        addObject(apple, 400, 200);
        
        // speed
        Greenfoot.setSpeed(40);
        
        // music
        // GreenfootSound music = new GreenfootSound("click.wav");
        // music.play();
        // // music loop  (need improve)
        // if (!music.isPlaying()) {
            // // delay
            // Greenfoot.delay(50);
            // // play agian
            // music.playLoop();
        // }
    }
    
    public void act() {
        if (numberOfObjects() >= 1) {
            // stop 
            if (apple.getX() >= 240 && apple.getX() <= 310 && apple.getY() >= 90 && apple.getY() <= 210) {
                showText("Smart ^^ Game Over", 400, 200);
                showText("hope you enjoy it~",400, 370);
                removeObject(apple);
                Greenfoot.stop();
            } else {
                showText("", 400, 200);
            }
        } else {
            // add object
            addObject(apple, 400, 200);
        }
    }
}
