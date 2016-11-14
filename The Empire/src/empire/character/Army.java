package empire.character;

public class Army {
	
	private int numArchers;
	
	private int numSoldiers;
	
	private int attack;
	
	private int defense;
	
	public Army() {
		numArchers = 0;
		numSoldiers = 0;
		attack = 0;
		defense = 0;
	}
	
	public int getSize() {
		return numArchers + numSoldiers;
	}
	
	public int getNumArchers() {
		return numArchers;
	}
	
	public int getNumSoldiers() {
		return numSoldiers;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void addArcher() {
		numArchers++;
		defense += Archer.defense;
		attack += Archer.attack;
	}
	
	public void addSoldier() {
		numSoldiers++;
		defense += Soldier.defense;
		attack += Soldier.attack;
	}
	
	public void loseArcher() {
		numArchers--;
		defense -= Archer.defense;
		attack -= Archer.attack;
	}
	
	public void loseSoldier() {
		numSoldiers--;
		defense -= Soldier.defense;
		attack -= Soldier.attack;
	}
	
	public void upgradeArchers() {
		Archer.upgradeAttack();
		Archer.upgradeDefense();
		updateStats();
	}
	
	public void upgradeSoldiers() {
		Soldier.upgradeAttack();
		Soldier.upgradeDefense();
		updateStats();
	}
	
	private void updateStats() {
		defense = numArchers*Archer.defense + numSoldiers*Soldier.defense;
		attack = numArchers*Archer.attack + numSoldiers*Soldier.attack;
	}
	
	private static class Archer {
		
		private static int attack = 5;
		
		private static int defense = 2;
		
		private static void upgradeAttack() {
			attack += 2;
		}
		
		private static void upgradeDefense() {
			defense++;
		}
		
	}
	
	private static class Soldier {
		
		private static int attack = 2;
		
		private static int defense = 5;
		
		private static void upgradeAttack() {
			attack++;
		}
		
		private static void upgradeDefense() {
			defense += 2;
		}
		
	}

}
