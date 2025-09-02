import java.util.*;
public class TaylorSwiftGameCopy
{	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an album from 1989, reputation, Speak Now, or Red");
		String userInput = scan.nextLine();
		if(userInput.equals("1989"))
		{
			yearBranch testBranch = new yearBranch(); 
			testBranch.nineteeneightnine(); 
		}
		else if(userInput.equals("reputation"))
		{
			
		}
		else if(userInput.equals("Speak Now"))
		{
			SpeakNow testNow = new SpeakNow();
			testNow.speakNow();
			
			
		}
		else if(scan.nextLine().equals("Red"))
		{
			
		}

	}
}