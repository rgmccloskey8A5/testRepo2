import java.io.*;
import java.util.*;

public class yearBranch
{
    public void nineteeneightnine()
    {
        int genNum = (1 + (int)(Math.random()* ((3-1) + 1)));
        Scanner scan = new Scanner(System.in);
        System.out.println("You chose 1989. Your lyrics will appear below. Only enter answers in capital letters of the first word.");

            //Blank Space song\
        if(genNum == 1)
        {
            System.out.println("Your first lyrics are:");
            System.out.println("Boys only want");
            if(scan.nextLine().equals("Blank Space"))
            {
                System.out.println("Congrats! You guessed the song"); 
            } 
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("Boys only want love if");
                if(scan.nextLine().equals("Blank Space"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("Boys only want love if it's torture");
                    if(scan.nextLine().equals("Blank Space"))
                    {
                        System.out.println("Congrats! You guessed the song"); 
                    }
                    else
                    {     
                        System.out.println("Sorry, you did not guess the song. The song is Blank Space!");
                    }
                }
            }
        }

        //This Love song
        if(genNum == 2)
        {
            System.out.println("Your first lyrics are:");
            System.out.println("These hands had");
            if(scan.nextLine().equals("This Love"))
            {
                System.out.println("Congrats! You guessed the song"); 
            }
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("These hands had to let");
                if(scan.nextLine().equals("This Love"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("These hands had to let it go free");
                    if(scan.nextLine().equals("This Love"))
                    {
                        System.out.println("Congrats! You guessed the song"); 
                    }
                    else
                    {
                        System.out.println("Sorry, you did not guess the song. The song is This Love!");
                    }
                }
            }
        }

        //Now That We Don't Talk song
        if(genNum == 3)
        {
            System.out.println("Your first lyrics are:");
            System.out.println("You grew your hair");
            if(scan.nextLine().equals("Now That We Don't Talk"))
            {
                System.out.println("Congrats! You guessed the song"); 
            }
            else
            {
                System.out.println("Your next lyrics are:");
                System.out.println("You grew your hair long, you got new");
                if(scan.nextLine().equals("Now That We Don't Talk"))
                {
                    System.out.println("Congrats! You guessed the song"); 
                }
                else
                {
                    System.out.println("Your next lyrics are:");
                    System.out.println("You grew your hair long, you got new icons, and from the outside");
                    if(scan.nextLine().equals("Now That We Don't Talk"))
                    {
                        System.out.println("Congrats! You guessed the song"); 
                    }
                    else
                    {
                        System.out.println("Sorry, you did not guess the song. The song is Now That We Don't Talk!");
                    }
                }
            }
        }
    }
}
