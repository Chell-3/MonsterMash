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
		System.out.println(defaultMonster);
		System.out.println(deadlyMonsterOfDoom);
	}
}
