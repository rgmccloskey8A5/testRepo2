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
			yearBranch test1989 = new yearBranch(); 
			test1989.nineteeneightnine(); 
		}
		else if(userInput.equals("reputation"))
		{

		}
		else if(userInput.equals("Speak Now"))
		{
			
		}
		else if(userInput.equals("Red"))
		{
			red testRed = new red(); 
			testRed.redPrinterAlbum(); 
		}

	}
}