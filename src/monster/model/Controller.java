package monster.model;

import java.util.Scanner;

import monster.thing.MarshmallowMonster;

public class Controller
{
	private MarshmallowMonster defaultMonster;
	private MarshmallowMonster deadlyMonsterOfDoom;
	private Scanner inputScanner;
	public Controller()
	{
		inputScanner = new Scanner(System.in);
		defaultMonster = new MarshmallowMonster();
		deadlyMonsterOfDoom = new MarshmallowMonster(5,1,15,false,3,2,"Edwin");
	}	
	public void start()
	{
		System.out.println("Would you like to create a monster?");
		String answer = inputScanner.nextLine();
		if (answer.equalsIgnoreCase("yes"))
		{
			makeMonsters();
		}
		else
		{
			System.out.println("Ok then. Let me telly you about my monster, " + deadlyMonsterOfDoom.getName());
		}
		inputScanner.close();
		System.out.println(deadlyMonsterOfDoom);
		System.out.println(deadlyMonsterOfDoom.getName() + " is in posession of " + deadlyMonsterOfDoom.getAntennaAmount() + " Antennae. You should fear him");
		System.out.println(deadlyMonsterOfDoom.getName() + " Has your address and also " + deadlyMonsterOfDoom.getAppendageCount() + " Limbs. With this information, he can take over your house.");
		System.out.println(deadlyMonsterOfDoom.getName() + " makes 1.5 million dollars per year. With this money, he can afford glasses for each and every one of his " + deadlyMonsterOfDoom.getEyeCount() + " eyes.");
		System.out.println("I certainly fear " + deadlyMonsterOfDoom.getName() + " and his " + deadlyMonsterOfDoom.getMouthCount() + " perfect mouths.");
		System.out.println("Luckily, however, " + deadlyMonsterOfDoom.getName() + " has multiple buttons that can be pressed. to be specific, he has " + deadlyMonsterOfDoom.getButtonCount() + " buttons.");
	}
	private void makeMonsters()
	{
		String response = "";
		System.out.println("What do you want your monster's name to be?");
		response = inputScanner.nextLine();
		deadlyMonsterOfDoom.setName(response);
		int wholeNumber = 0;
		double realNumber = 0.0;
		System.out.println("How many limbs does your monster have?");
		wholeNumber = inputScanner.nextInt();
		inputScanner.nextLine();
		deadlyMonsterOfDoom.setAppendageCount(wholeNumber);
		System.out.println("How many antennae does your monster have?");
		realNumber = inputScanner.nextDouble();
		inputScanner.nextLine();
		deadlyMonsterOfDoom.setAntennaAmount(realNumber);
	}
}
