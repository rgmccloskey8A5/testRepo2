import java.util.Scanner;
public class reputation
{	
	public void reputationTester() 
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("You chose reputation");
        int random = 3; 

        //int random = (int)(Math.random() * 3 + 1);
        if (random == 1) 
        {
            // getaway car
            String getawaycar = "Getaway Car";
            System.out.println("You were driving");
            
            if (scan.nextLine().equals("Getaway Car"))
            {
                System.out.println("Congrats! You win!");
            } 
            else 
            {
                
                System.out.println("You were driving a ");

                if (scan.nextLine().equals("Getaway Car")) 
                {
                    System.out.println("Congrats! You win!");
                } 
                else 
                {
                    
                    System.out.println("now your lyrics are : You were driving a getaway");
                    if (scan.nextLine().equals("Getaway Car")) 
                    {
                        System.out.println("Congrats! You win!");
                    } 
                    else 
                    {
                        
                        System.out.println("now your lyrics are : You were driving a getaway car");
                        if (scan.nextLine().equals("Getaway Car")) 
                        {
                            System.out.println("Congrats! You win!");
                        } 
                        else 
                        {
                            System.out.println("You lose!");
                        }
                    }
                }
            }
        }


         if (random == 2) 
        {
            // getaway car
            String getawaycar = "Dress";
            System.out.println("Say my name");
            
            if (scan.nextLine().equals("Dress"))
            {
                System.out.println("Congrats! You win!");
            } 
            else 
            {
                
                System.out.println("Say my name and ");

                if (scan.nextLine().equals("Dress")) 
                {
                    System.out.println("Congrats! You win!");
                } 
                else 
                {
                    
                    System.out.println("now your lyrics are : Say my name and everything");
                    if (scan.nextLine().equals("Dress")) 
                    {
                        System.out.println("Congrats! You win!");
                    } 
                    else 
                    {
                        
                        System.out.println("now your lyrics are : Say my name and everything just");
                        if (scan.nextLine().equals("Dress")) 
                        {
                            System.out.println("Congrats! You win!");
                        } 
                        else 
                        {
                            System.out.println("You lose!");
                        }
                    }
                }
            }
        }
    

         if (random == 3) 
        {
            // getaway car
            String getawaycar = "King of My Heart";
            System.out.println("And all at once");
            
            if (scan.nextLine().equals("King of My Heart"))
            {
                System.out.println("Congrats! You win!");
            } 
            else 
            {
                
                System.out.println("And all at once your");

                if (scan.nextLine().equals("King of My Heart")) 
                {
                    System.out.println("Congrats! You win!");
                } 
                else 
                {
                    
                    System.out.println("now your lyrics are : And all at once your all");
                    if (scan.nextLine().equals("King of My Heart")) 
                    {
                        System.out.println("Congrats! You win!");
                    } 
                    else 
                    {
                        
                        System.out.println("now your lyrics are : And all at once your all I'm");
                        if (scan.nextLine().equals("King of My Heart")) 
                        {
                            System.out.println("Congrats! You win!");
                        } 
                        else 
                        {
                            System.out.println("You lose!");
                        }
                    }
                }
            }
        }


        



    }

    
    public static void main(String[] args)
	{
	    
		reputationTester();
	}
}