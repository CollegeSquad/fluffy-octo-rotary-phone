package empire.character;

import java.applet.Applet;

public class Player extends Character {
	
	private static final int STARTER_HEALTH = 100;
	private static final int HEALTH_CAP = 500;
	private static final int MAX_JUMP_HEIGHT = 5;
	private static int currentTotalHealth;
	private static int currentHealth;
	private static int defense;
	private static int attack;
	private static int moveSpeed;
	private static int jumpHeight;
	
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
		defense = defense;
		attack = attack;
		moveSpeed = moveSpeed;
		jumpHeight = jumpHeight;
		currentHealth = currentTotalHealth;
	}
	
	public static void increaseTotalHealth(int add)
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
	public static void increaseDefense(int add)
	{
		defense += add;
	}
	public static void increaseAttack(int add)
	{
		attack += add;
	}
	public static void increaseMoveSpeed(int add)
	{
		moveSpeed += add;
	}
	public static void increaseJumpHeight(int add)
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
	
	
	public static void takeDamage(int damage)
	{
		currentHealth -= damage;
		if (currentHealth <= 0)
		{
		Player.die();
		}
	}
	/**
	 * Need this method to move the character back to a spawn point, and then
	 * have some sort of penalty. Lose some money or shit.
	 */
	public static void die()
	{
		
	}
	
	
	}
	
	
	
	
	
	

