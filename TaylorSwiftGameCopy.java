import java.util.Scanner;
public class TaylorSwiftGameCopy
{	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String userInput = " ";
		while (true) 
		{
            System.out.println("Choose an album from 1989, reputation, Speak Now, or Red");
            userInput = scan.nextLine();
            if (userInput.equals("1989") || userInput.equals("Red") || userInput.equals("reputation") || userInput.equals("Speak Now")) 
			{
                break; 
            } 
			else 
			{
                System.out.println("Please type a valid album to guess from.");
            }
        }

		if(userInput.equals("1989"))
		{
		yearBranch test1989 = new yearBranch(); 
			test1989.nineteeneightnine(); 
		}
		else if(userInput.equals("reputation"))
		{
			
		}
		else if(userInput.equals("Speak Now"))
		{
			SpeakNow testNow = new SpeakNow();
			testNow.speakNow();
			
			
		}
		else if(userInput.equals("Red"))
		{
			red testRed = new red(); 
			testRed.redPrinterAlbum(); 
		}
	}
}