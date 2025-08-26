public class TaylorSwiftGame
{	
	private static void speakNow()
       {
         System.out.println("You chose Speak Now.");
	      if(((int) (Math.random() * 3) + 1) == 1)
	      {
		      System.out.println("Your lyrics are: \n Drop everything now");
		      if(scan.nextLine().equals("Sparks Fly"))
		      {
			      System.out.println("Congrats! You win!"); 
		      }

		      else
		      {
			      System.out.println("Drop everything now, meet");
			      if(scan.nextLine().equals("Sparks Fly"))
			      {
				      System.out.println("Congrats! You win!"); 
			      }
			      else
			      {
				      System.out.println("Drop everything now, meet me");
				      if(scan.nextLine().equals("Sparks Fly"))
				      {
					      System.out.println("Congrats! You win!"); 
				      }
				      else
				      {
					      System.out.println("You lose :(");
				      }
			      }
		      }
	      }

       }
     
   public static void main(String[] args)
	{
	    /*
		 * Hannah is: red
		 * Colbie is: speak now
		 * Nilaya is: reputation
		 * Rebecca is: 1989
		 */

       
		//System.out.println("ABC"); 
	}
}