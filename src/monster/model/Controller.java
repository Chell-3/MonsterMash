package monster.model;

import monster.thing.MarshmallowMonster;

public class Controller
{
	private MarshmallowMonster defaultMonster;
	private MarshmallowMonster deadlyMonsterOfDoom;
	public Controller()
	{
		defaultMonster = new MarshmallowMonster();
		deadlyMonsterOfDoom = new MarshmallowMonster(5,1,15,false,3,2,"Edwin");
	}	
	public void start()
	{
		System.out.println(deadlyMonsterOfDoom);
		System.out.println(deadlyMonsterOfDoom.getName() + " is in posession of " + deadlyMonsterOfDoom.getAntennaAmount() + " Antennae. You should fear him");
		System.out.println(deadlyMonsterOfDoom.getName() + " Has your address and also " + deadlyMonsterOfDoom.getAppendageCount() + " Limbs. With this information, he can take over your house.");
		System.out.println(deadlyMonsterOfDoom.getName() + " makes 1.5 million dollars per year. With this money, he can afford glasses for each and every one of his " + deadlyMonsterOfDoom.getEyeCount() + " eyes.");
		
	}
}
