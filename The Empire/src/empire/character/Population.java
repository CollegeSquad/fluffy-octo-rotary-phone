package empire.character;

public class Population {
	
	private int numCitizens;
	
	private int numBlacksmiths;
	
	private int numShopKeepers;
	
	private int numHunters;
	
	private int numFarmers;
	
	public Population() {
		numCitizens = 0;
		numBlacksmiths = 0;
		numShopKeepers = 0;
		numHunters = 0;
		numFarmers = 0;
	}
	
	public int getPopulation() {
		return numCitizens;
	}
	
	public int getPopulationWithoutJobs() {
		return numCitizens - (numBlacksmiths + numShopKeepers + numHunters + numFarmers);
	}
	
	public void addCitizen() {
		numCitizens++;
	}
	
	public void addBlacksmith() {
		numBlacksmiths++;
	}
	
	public void addShopKeeper() {
		numShopKeepers++;
	}
	
	public void addHuner() {
		numHunters++;
	}
	
	public void addFarmer() {
		numFarmers++;
	}
	
	public int collectRent() {
		return Citizen.payRent()*getPopulation();
	}
	
	private static class Citizen {
		
		private static int payRent() {
			return 10;
		}
		
	}
	
	private static class Blacksmith extends Citizen {
	
		
		
	}
	
}
