package empire.character;

public class Population {
	/**
	 * need a base level of max population and a current level of max population that can be upgradeable
	 */
	private static final int STARTER_MAX_POPULATION = 50;	
	
	private static int currentMaxPopulation;
	
	private static int numCitizens;

	private static int numBlacksmiths;

	private static int numShopKeepers;

	private static int numHunters;

	private static int numFarmers;

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

	public void addHunter() {
		numHunters++;
	}

	public void addFarmer() {
		numFarmers++;
	}

	public int collectRent() {
		return Citizen.payRent()*getPopulation();
	}

	private static class Citizen 
	{

		private static int payRent() 
		{
			return 10;
		}
		
		private static void createBlackSmith()
		{
			numCitizens --;
			numBlacksmiths ++;
		}
		private static void createShopKeeper()
		{
			numCitizens --;
			numShopKeepers ++;
		}
		private static void createFarmer()
		{
			numCitizens --;
			numFarmers ++;
		}
		private static void createHunter()
		{
			numCitizens --;
			numHunters ++;
		}

	}
	
	/**
	 * 
	 * Each of the subclasses of citizen could have
	 * some sort of "upgrade" path where they can offer
	 * different services or end up paying more rent.
	 *
	 */
	
	private static class Blacksmith extends Citizen 
	{
		private static int payRent() 
		{
			return 15;
		}
	}
	private static class ShopKeeper extends Citizen 
	{
		private static int payRent() 
		{
			return 20;
		}
	}
	private static class Hunter extends Citizen 
	{
		private static int payRent() 
		{
			return 12;
		}
	}
	private static class Farmer extends Citizen 
	{
		private static int payRent() 
		{
			return 5;
		}
	}

}
