package monster.thing;

public class MarshmallowMonster
{
	private int appendageCount;
	private double antennaAmount;
	private int eyeCount;
	private boolean hasMoles;
	private int mouthCount;
	private int buttonCount;
	private String name;
	
	public MarshmallowMonster()
	{
		this.appendageCount = -99;
		this.antennaAmount = -99.99;
		this.eyeCount = -99;
		this.hasMoles = false;
		this.mouthCount = -99;
		this.buttonCount = -99;
		this.name = "Edwin, the kindhearted";
	}
	
	public MarshmallowMonster(int appendageCount, double antennaAmount, int eyeCount, boolean hasMoles, int mouthCount, int buttonCount, String name)
	{
		this.appendageCount = appendageCount;
		this.antennaAmount = antennaAmount;
		this.eyeCount = eyeCount;
		this.hasMoles = hasMoles;
		this.mouthCount = mouthCount;
		this.buttonCount = buttonCount;
		this.name = name;
	}
	
	public int getAppendageCount()
	{
		return appendageCount;
	}
	public double getAntennaAmount()
	{
		return antennaAmount;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public boolean getHasMoles()
	{
		return hasMoles;
	}
	public int getMouthCount()
	{
		return mouthCount;
	}
	public double getButtonCount()
	{
		return buttonCount;
	}
	public String getName()
	{
		return name;
	}
	public void setAppendageCount(int appendageCount)
	{
		this.appendageCount = appendageCount;
	}
	public void setAntennaAmount(double antennaAmount)
	{
		this.antennaAmount = antennaAmount;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setHasMoles(boolean hasMoles)
	{
		this.hasMoles = hasMoles;
	}
	public void setMouthCount(int mouthCount)
	{
		this.mouthCount = mouthCount;
	}
	public void setButtonCount(int buttonCount)
	{
		this.buttonCount = buttonCount;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		String description = "sup bruh, i be da monstah known only as " + name;
		return description;
	}
}
