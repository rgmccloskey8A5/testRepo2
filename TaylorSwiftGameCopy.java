import java.util.Scanner;
public class TaylorSwiftGameCopy
{	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an album from 1989, reputation, Speak Now, or Red");
		String userInput = scan.nextLine();
		if(userInput.equals("1989"))
		{

		}
		else if(userInput.equals("reputation"))
		{
			reputation testPrinter = new reputation();
        	testPrinter.reputationTester();
		}
		else if(userInput.equals("Speak Now"))
		{

		}
		else if(userInput.equals("Red"))
		{

		}

	}
}