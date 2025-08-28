import java.util.Scanner;
public class TaylorSwiftGameCopy
{	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an album from 1989, reputation, Speak Now, or Red");

		if(scan.nextLine().equals("1989"))
		{
			yearBranch testGame = new yearBranch();
        	testGame.nineteeneightnine();
		}
		if(scan.nextLine().equals("reputation"))
		{

		}
		if(scan.nextLine().equals("Speak Now"))
		{

		}
		if(scan.nextLine().equals("Red"))
		{

		}

	    // System.out.println("ABC"); 
	    // System.out.println("hi!");
	}
}