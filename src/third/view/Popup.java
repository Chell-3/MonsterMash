package third.view;

import javax.swing.JOptionPane;

public class Popup
{
	public void displayMessage(String text)
	{
		JOptionPane.showMessageDialog(null, text);
	}
	
	public String askQuestion(String text)
	{
		String answer = "";
		answer += JOptionPane.showInputDialog(null,text);
		return(answer);
	}
	public int askWarningOptions(String title, String contents, String option1, String option2)
	{
		Object[] options = {option1,option2};
		return JOptionPane.showOptionDialog(null, contents, title,JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,null,options,null);
	}
}
