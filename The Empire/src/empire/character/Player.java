package empire.character;

import java.applet.Applet;
/**
 * 
 * @author Max
 * This is the Player class. It extends character.
 * It creates the users character and initializes its stats.
 *
 */
public class Player  {
	
	private static final int STARTER_HEALTH = 100;
	private static final int HEALTH_CAP = 500;
	private static final int MAX_JUMP_HEIGHT = 5;
	private int currentTotalHealth;
	private int currentHealth;
	private int defense;
	private int attack;
	private int moveSpeed;
	private int jumpHeight;
	private Army army;
	
	public Player()
	{
		currentTotalHealth = STARTER_HEALTH;
		defense = 0;
		attack = 1;
		moveSpeed = 1;
		jumpHeight = 1;
		currentHealth = currentTotalHealth;
	}
	
	public Player(int health, int defense, int attack, int moveSpeed, int jumpHeight)
	{
		currentTotalHealth = health;
		this.defense = defense;
		this.attack = attack;
		this.moveSpeed = moveSpeed;
		this.jumpHeight = jumpHeight;
		currentHealth = currentTotalHealth;
	}
	
	public void increaseTotalHealth(int add)
	{
		if (currentTotalHealth + add <= 500)
		{
			currentTotalHealth += add;
		}
		else if (currentTotalHealth + add >= 500)
		{
			currentTotalHealth = 500;
		}
	}
	public void increaseDefense(int add)
	{
		defense += add;
	}
	public void increaseAttack(int add)
	{
		attack += add;
	}
	public void increaseMoveSpeed(int add)
	{
		moveSpeed += add;
	}
	public void increaseJumpHeight(int add)
	{
		if (jumpHeight + add <= 5)
		{
		jumpHeight += add;
		}
		else if (jumpHeight + add >= 5)
		{
			jumpHeight = 5;
		}
	}
	
	
	public void takeDamage(int damage)
	{
		currentHealth -= damage;
		if (currentHealth <= 0)
		{
		die();
		}
	}
	/**
	 * Need this method to move the character back to a spawn point, and then
	 * have some sort of penalty. Lose some money or shit.
	 */
	public void die()
	{
		
	}
	
	
}
	
	
	
	
	
	

