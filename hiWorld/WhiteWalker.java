import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteWalker here.
 * 
 * @tatatingting (your name) 
 * @v1.2 (a version number or a date)
 */
public class WhiteWalker extends Actor
{
    /**
     * Act - do whatever the WhiteWalker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WhiteWalker() 
    {
        // Add your action code here.
        setImage("apple1.png");

    }
    
    public void act()
    {
        // MOVE
        // 1
        // int x = getX();
        // int y = getY();
        // x++;
        // setLocation(x, y);
        
        // 2
        // setLocation(getX() + 1, getY());
        
        // 3
        move(1); // 当前方向移动1
        
        // control move
        if (Greenfoot.isKeyDown("space")) {
            move(10);
            Greenfoot.playSound("f.wav");
        }
        
        // 当运动到边缘时，加速
        if (getX() < 50 || getX() > 750 || getY() < 50 || getY() > 350) {
            move(50);
            turn(50);
        }
        
        
        // TURN
        // 1
        // int rot = getRotation() + 1;
        // if (rot == 360) {
            // rot = 0;
        // }
        // setRotation(rot);
        
        // 2
        // turn(1); // 顺时针转1°
        
        // random act
        if (Greenfoot.getRandomNumber(2) == 0) {
            turn(20); // 0, 
        } else {
            turn(-30); // 1, 
        }
        
        // change image
        if (Greenfoot.getRandomNumber(6) < 3) {
            // 0,1,2,vs 3,4,5; 3/6
            setImage("apple1.png");
        } else {
            setImage("apple2.png");
        }
        
        
        // music
        int myNumber = Greenfoot.getRandomNumber(7);
        // if (myNumber == 6) {
            // GreenfootSound music = new GreenfootSound(51+".wav");
            // music.play();
        // } else if (myNumber == 5) {
            // GreenfootSound music = new GreenfootSound(49+".wav");
            // music.play();
        // } else if (myNumber == 4) {
            // GreenfootSound music = new GreenfootSound(47+".wav");
            // music.play();
        // } else if (myNumber == 3) {
            // GreenfootSound music = new GreenfootSound(45+".wav");
            // music.play();
        // } else if (myNumber == 2) {
            // GreenfootSound music = new GreenfootSound(44+".wav");
            // music.play();
        // } else if (myNumber == 1) {
            // GreenfootSound music = new GreenfootSound(42+".wav");
            // music.play();
        // } else if (myNumber == 0) {
            // GreenfootSound music = new GreenfootSound(40+".wav");
            // music.play();
        // } else {
            // GreenfootSound music = new GreenfootSound("click.wav");
            // music.play();
        // }
        if (myNumber == 6) {
            Greenfoot.playSound(51+".wav");
        } else if (myNumber == 5) {
            Greenfoot.playSound(49+".wav");
        } else if (myNumber == 4) {
            Greenfoot.playSound(47+".wav");
        } else if (myNumber == 3) {
            Greenfoot.playSound(45+".wav");
        } else if (myNumber == 2) {
            Greenfoot.playSound(44+".wav");
        } else if (myNumber == 1) {
            Greenfoot.playSound(42+".wav");
        } else if (myNumber == 0) {
            Greenfoot.playSound(40+".wav");
        } else {
            Greenfoot.playSound("f.wav");
        }
    }  
}
