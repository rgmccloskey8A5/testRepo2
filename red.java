import java.io.*;
import java.util.*;

public class red
{
    public void redPrinterAlbum()
    {
        int genNum = (1 + (int)(Math.random()* ((7-1) + 1)));
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
            if(scan.nextLine().equals("ALL TOO WELL"))
            {
                System.out.println("Congrats! You guessed the song"); 
            }
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("Oh your sweet disposition and my wide eyed gaze");
                if(scan.nextLine().equals("ALL TOO WELL"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("Oh your sweet disposition and my wide eyed gaze, we're singin' in the car");
                    if(scan.nextLine().equals("ALL TOO WELL"))
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
            if(scan.nextLine().equals("I KNEW YOU WERE TROUBLE"))
            {
                System.out.println("Congrats! You guessed the song"); 
            }
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("No apologies, he'll never see you cry");
                if(scan.nextLine().equals("I KNEW YOU WERE TROUBLE"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("No apologies, he'll never see you cry pretend he doesn't know");
                    if(scan.nextLine().equals("I KNEW YOU WERE TROUBLE"))
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
        //Red song
        if(genNum == 4)
        {
            System.out.println("Your first lyrics are:");
            System.out.println("Losing him was blue like I'd never");
            if(scan.nextLine().equals("RED"))
            {
                System.out.println("Congrats! You guessed the song"); 
            } 
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("Losing him was blue like I'd never known, missing him was");
                if(scan.nextLine().equals("RED"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("Losing him was blue like I'd never known, missing him was dark grey all alone");
                    if(scan.nextLine().equals("RED"))
                    {
                        System.out.println("Congrats! You guessed the song"); 
                    }
                    else
                    {     
                        System.out.println("Sorry, you did not guess the song. The song is Red!");
                    }
                }
            }
        }

        //Stay, Stay, Stay song
        if(genNum == 5)
        {
            System.out.println("Your first lyrics are:");
            System.out.println("I've beem lovin' you for quite");
            if(scan.nextLine().equals("STAY, STAY, STAY"))
            {
                System.out.println("Congrats! You guessed the song"); 
            } 
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("I've beem lovin' you for quite some time, time, time");
                if(scan.nextLine().equals("STAY, STAY, STAY"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("I've beem lovin' you for quite some time, time, time, you think that it's funny");
                    if(scan.nextLine().equals("STAY, STAY, STAY"))
                    {
                        System.out.println("Congrats! You guessed the song"); 
                    }
                    else
                    {     
                        System.out.println("Sorry, you did not guess the song. The song is Stay, Stay, Stay!");
                    }
                }
            }
        }

        //Everything Has Changed song
        if(genNum == 6)
        {
            System.out.println("Your first lyrics are:");
            System.out.println("Cause all I know is we said,");
            if(scan.nextLine().equals("EVERYTHING HAS CHANGED"))
            {
                System.out.println("Congrats! You guessed the song"); 
            } 
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("Cause all I know is we said, 'hello' and your eyes looked like");
                if(scan.nextLine().equals("EVERYTHING HAS CHANGED"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("Cause all I know is we said, 'hello' and your eyes looked like comin' home");
                    if(scan.nextLine().equals("EVERYTHING HAS CHANGED"))
                    {
                        System.out.println("Congrats! You guessed the song"); 
                    }
                    else
                    {     
                        System.out.println("Sorry, you did not guess the song. The song is Everything Has Changed!");
                    }
                }
            }
        }

        //Is It Over Now? song
        if(genNum == 7)
        {
            System.out.println("Your first lyrics are:");
            System.out.println("Cause you could be the one that I love");
            if(scan.nextLine().equals("MESSAGE IN A BOTTLE"))
            {
                System.out.println("Congrats! You guessed the song"); 
            } 
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("Cause you could be the one that I love I could be the one that you");
                if(scan.nextLine().equals("MESSAGE IN A BOTTLE"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("Cause you could be the one that I love I could be the one that you dream of A message in a bottl");
                    if(scan.nextLine().equals("MESSAGE IN A BOTTLE"))
                    {
                        System.out.println("Congrats! You guessed the song"); 
                    }
                    else
                    {     
                        System.out.println("Sorry, you did not guess the song. The song is Message In A Bottle!");
                    }
                }
            }
        }
    }
}
