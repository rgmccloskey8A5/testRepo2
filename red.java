import java.io.*;
import java.util.*;

public class red
{
    public void redPrinterAlbum()
    {
        int genNum = (1 + (int)(Math.random()* ((3-1) + 1)));
        Scanner scan = new Scanner(System.in);
        System.out.println("You chose Red. Your lyrics will appear below. Please capitalize the first letter of every word.");

            //22 song
        if(genNum == 1)
        {
            System.out.println("Your first lyrics are:");
            System.out.println("It feels like a perfect");
            if(scan.nextLine().equals("22"))
            {
                System.out.println("Congrats! You guessed the song"); 
            } 
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("It feels like a perfect night to dress up");
                if(scan.nextLine().equals("22"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("It feels like a perfect night to dress up like hipsters");
                    if(scan.nextLine().equals("22"))
                    {
                        System.out.println("Congrats! You guessed the song"); 
                    }
                    else
                    {     
                        System.out.println("Sorry, you did not guess the song. The song is 22!");
                    }
                }
            }
        }

        //All Too Well song
        if(genNum == 2)
        {
            System.out.println("Your first lyrics are:");
            System.out.println("Oh your sweet disposition");
            if(scan.nextLine().equals("All Too Well"))
            {
                System.out.println("Congrats! You guessed the song"); 
            }
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("Oh your sweet disposition and my wide eyed gaze");
                if(scan.nextLine().equals("All Too Well"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("Oh your sweet disposition and my wide eyed gaze, we're singin' in the car");
                    if(scan.nextLine().equals("All Too Well"))
                    {
                        System.out.println("Congrats! You guessed the song"); 
                    }
                    else
                    {
                        System.out.println("Sorry, you did not guess the song. The song is All Too Well!");
                    }
                }
            }
        }

        //I Knew You Were Trouble song
        if(genNum == 3)
        {
            System.out.println("Your first lyrics are:");
            System.out.println("No apologies, he'll never");
            if(scan.nextLine().equals("I Knew You Were Trouble"))
            {
                System.out.println("Congrats! You guessed the song"); 
            }
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("No apologies, he'll never see you cry");
                if(scan.nextLine().equals("I Knew You Were Trouble"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("No apologies, he'll never see you cry pretend he doesn't know");
                    if(scan.nextLine().equals("I Knew You Were Trouble"))
                    {
                        System.out.println("Congrats! You guessed the song"); 
                    }
                    else
                    {
                        System.out.println("Sorry, you did not guess the song. The song is I Knew You Were Trouble!");
                    }
                }
            }
        }
    }
}
