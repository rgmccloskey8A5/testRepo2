//import java.io*;
import java.util.*;
public class SpeakNow
{	
	public void speakNow()
       {
         System.out.println("You chose Speak Now.");
		 Scanner scan = new Scanner(System.in);
         int rand = (int) ((Math.random() * 3) + 1);
         System.out.println("your rand int is " + rand);
         if(rand == 1)
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
          
          else if(rand == 2)
	      {
                
		      System.out.println("Your lyrics are: \n Do you remember");
		      if(scan.nextLine().equals("Mine"))
		      {
			      System.out.println("Congrats! You win!"); 
		      }

		      else
		      {
			      System.out.println("Do you remember, we");
			      if(scan.nextLine().equals("Mine"))
			      {
				      System.out.println("Congrats! You win!"); 
			      }
			      else
			      {
				      System.out.println("Do you remember, we were");
				      if(scan.nextLine().equals("Mine"))
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

          else 
	      {
                
		      System.out.println("Your lyrics are: \n I was screaming");
		      if(scan.nextLine().equals("Long Live"))
		      {
			      System.out.println("Congrats! You win!"); 
		      }

		      else
		      {
			      System.out.println("I was screaming, 'long");
			      if(scan.nextLine().equals("Long Live"))
			      {
				      System.out.println("Congrats! You win!"); 
			      }
			      else
			      {
				      System.out.println("I was screaming, 'long live'");
				      if(scan.nextLine().equals("Long Live"))
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
     

}