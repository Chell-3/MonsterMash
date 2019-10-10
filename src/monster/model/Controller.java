package monster.model;

import third.view.Popup;
import java.util.Scanner;

import monster.thing.MarshmallowMonster;

public class Controller
{
	private Popup view;
	private MarshmallowMonster defaultMonster;
	private MarshmallowMonster deadlyMonsterOfDoom;
	private Scanner inputScanner;
	public Controller()
	{
		view = new Popup();
		inputScanner = new Scanner(System.in);
		defaultMonster = new MarshmallowMonster(5,1,15,false,3,2,"Edwin");
		deadlyMonsterOfDoom = new MarshmallowMonster(5,1,15,false,3,2,"Edwin");
	}	
	public void start()
	{
		String answer = view.askQuestion("Would you like to create a monster?");
		if (answer.equalsIgnoreCase("yes"))
		{
			makeMonsters();
		}
		else
		{
			view.displayMessage("Ok then. Let me telly you about my monster, " + deadlyMonsterOfDoom.getName());
		}
		inputScanner.close();
		view.displayMessage(deadlyMonsterOfDoom.getName() + " is in posession of " + deadlyMonsterOfDoom.getAntennaAmount() + " Antennae. You should fear him.\n" +	deadlyMonsterOfDoom.getName() + " Has your address and also " + deadlyMonsterOfDoom.getAppendageCount() + " Limbs. With this information, he can take over your house.\n" + deadlyMonsterOfDoom.getName() + " makes 1.5 million dollars per year. With this money, he can afford glasses for each and every one of his " + deadlyMonsterOfDoom.getEyeCount() + " eyes.\nI certainly fear " + deadlyMonsterOfDoom.getName() + " and his " + deadlyMonsterOfDoom.getMouthCount() + " perfect mouths.\nLuckily, however, " + deadlyMonsterOfDoom.getName() + " has multiple buttons that can be pressed. to be specific, he has " + deadlyMonsterOfDoom.getButtonCount() + " buttons.");
	}
	private void makeMonsters()
	{
		String response = "";
		response = view.askQuestion("What do you want the monster to be named?");
		deadlyMonsterOfDoom.setName(response);
		response = view.askQuestion("How many appendages for " + deadlyMonsterOfDoom.getName());
		while(!validateInt(response))
		{
			response = view.askQuestion("That's not an acceptable number. don't type it out, and it has to be a whole number.");
		}
		deadlyMonsterOfDoom.setAppendageCount(Integer.parseInt(response));
		
		
		response = view.askQuestion("How many antennae does your monster have?");
		while(!validateDouble(response))
		{
			response = view.askQuestion("That's not an acceptable double(Type a decimal or something).");
		}
		deadlyMonsterOfDoom.setAntennaAmount(Double.parseDouble(response));
		response = view.askQuestion("Does " + deadlyMonsterOfDoom.getName() + " have any moles?");
		deadlyMonsterOfDoom.setHasMoles((response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("Y")));
		
		response = view.askQuestion("How many eyes does " + deadlyMonsterOfDoom.getName() + " have?");
		while(!validateInt(response))
		{
			response = view.askQuestion("That's not an acceptable number. don't type it out, and it has to be a whole number.");
		}
		deadlyMonsterOfDoom.setEyeCount(Integer.parseInt(response));
		
		response = view.askQuestion("How many mouths does " + deadlyMonsterOfDoom.getName() + " have?");
		while(!validateInt(response))
		{
			response = view.askQuestion("That's not an acceptable number. don't type it out, and it has to be a whole number.");
		}
		deadlyMonsterOfDoom.setMouthCount(Integer.parseInt(response));
		
		response = view.askQuestion("How many buttons does " + deadlyMonsterOfDoom.getName() + " have?");
		while(!validateInt(response))
		{
			response = view.askQuestion("That's not an acceptable number. don't type it out, and it has to be a whole number.");
		}
		deadlyMonsterOfDoom.setButtonCount(Integer.parseInt(response));
		view.displayMessage("OK!\n\nIt's time to meet your monster!");
		
	}
	private void makeManyMonsters()
	{
		MarshmallowMonster list[] = {deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom,deadlyMonsterOfDoom};
		for(int monsterCount = 0; monsterCount < 4; monsterCount++)
		{
			makeMonsters();
		}
	}
	public boolean validateInt(String input)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(input);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			view.displayMessage("That is not an int. Try again!");
		}
		return isValid;
	}
	public boolean validateDouble(String input)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(input);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			view.displayMessage("That is not a Double (Number with a decimal or something). Try again!");
		}
		return isValid;
	}
}
