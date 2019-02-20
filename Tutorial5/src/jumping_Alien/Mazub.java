package jumping_Alien;
import java.awt.Point;
import java.awt.geom.Point2D;

import be.kuleuven.cs.som.annotate.*;


/**
 * Mazub is a rectangular character that moves and interacts with his surroundings on a 1024x768 pixel game world.
 * His position is defined as his bottom left pixel. Mazub may not be completely outside the playing field but can, 
 * in part, cross the top and bottom border. Mazub is always completely covering a pixel. He cannot cover a pixel 
 * partially. Mazub's orientation is left or right. If he hasn't moved for at least 1 second he will return to default
 * which is facing right. The maximum speed horizontally is 3 m/s, but this may change during the game or in later 
 * versions, and the minimum is 1m/s, this might change in game or in later versions but will never be below 1 m/s.
 * If he is ducking however his speed is constant at 1 m/s. Previous speeds are defined as absolute value of change 
 * of position divided by time. Vertically he will not move faster than 8 m/s. No lower bound is given. When Mazub 
 * starts moving horizontally he accelerates from minimum velocity with 0.9m/s^2 until he reaches maximum velocity.
 * This rate of accelerations must be changeable in future versions of the game. Jumping starting velocity is 8m/s
 * and can be stopped with method endJump. If his location is not 0, and therefore not at the bottom of the world,
 * he will start falling with acceleration of -10m/s^2. (until reaching max negative velocity of 8m/s???) When Mazub
 * ducks he will decrease in size.
 * 
 * @author ict
 *
 */
public class Mazub {
	
	private Point2D.Double position;
	private int xVelocity;
	private int yVelocity;
	private int sprite;
	private int height;
	private int width;
	
	public Mazub(int[] Position,int xVelocity, int yVelocity, int... sprite) {
		this.position.setLocation(0,0);
		this.xVelocity = 0;
		this.yVelocity = 0;	
		this.sprite=0;
		this.height=2;
		this.width=1;
	}
	@Basic
	public Point2D.Double getPosition(){
		return this.position;
	}
	
	@Basic
	public int getXVelocity() {
		return this.xVelocity;
	}
	
	@Basic
	public void setXVelocity() {
		
	}
	
	@Basic
	public int getYVelocity() {
		return this.yVelocity;
	}
	
	@Basic
	public void setYVelocity() {
		
	}
	
	@Basic
	public int getCurrentSprite() {
		return this.sprite;
	}
	
	@Basic
	public void setSprite() {
		
	}
	
	@Basic
	public int getHeight() {
		//immutable?? dus dan ook static.
		return this.height;
	}
	
	@Basic
	public void setHeight() {
		
	}
	
	@Basic
	public int getWidth() {
		//tzelfde als height
		return this.width;
	}
	
	@Basic
	public void setWidth() {
		
	}
	
	public boolean isProPerCoordinate() {
		return true;
	}
	
	public static int xGetMaxVelocity() {
		return 0;
	}
	
	public static int xGetMinVelocity() {
		return 0;
	}
	
	public static int yGetMaxVelocity() {
		return 0;
	}
	
	public static int yGetMinVelocity() {
		return 0;
	}
	
	public void startMove() {
		
	}
	
	public void stopMove() {
		
	}
	
	public void startJump() {
		
	}
	
	public void stopJump() {
		
	}
	
	public void startFall() {
		
	}
	
	public void stopFall() {
		
	}
	
	public void startDuck() {
		
	}
	
	public void stopDuck() {
		
	}
	
	public void advanceTime() {
		
	}
	
	
	
}
