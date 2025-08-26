public class TaylorSwiftGame
{	
	private static void reputation() 
    {
        
        
        System.out.println("You chose reputation");

        if ((int)(Math.random() * 3 + 1) == 1) 
        {
            // getaway car
            String getawaycar = "You were driving";
            System.out.println("You were driving");

            if (scan.nextLine().equals(getawaycar)) 
            {
                System.out.println("Congrats! You win!");
            } 
            else 
            {
                getawaycar = "You were driving a ";
                System.out.println("You were driving a ");

                if (scan.nextLine().equals(getawaycar)) 
                {
                    System.out.println("Congrats! You win!");
                } 
                else 
                {
                    getawaycar = "You were driving a ";
                    System.out.println("now your lyrics are : You were driving a ");
                    if (scan.nextLine().equals(getawaycar)) 
                    {
                        System.out.println("Congrats! You win!");
                    } 
                    else 
                    {
                        getawaycar = "You were driving a ";
                        System.out.println("now your lyrics are : You were driving a ");
                        if (scan.nextLine().equals(getawaycar)) 
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
	    
		
	}
}