import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/* This class designs a simple lottery game
 */
public class LotteryGame
{
	
	//This function would be called to start the game
	void playGame()
	{
	char ch = 'N'; //Used to store the user input to continue or discontinue with the program
	int nextNumber = 0; //Used to store the next input number by the user
	char ignore ='0'; // char used to discard any other characters in the input buffer
	// This try catch block will handle the exceptions
	try
	{	
	// do - while loop used to restart/stop the game according to the user input
	do
	{
		int trial = 0; //this variable will capture the number of user trails and has the initial value of 0
		Random randomno = new Random(); // create random object
		int randomNumber = randomno.nextInt(51); // generates a random number between 0 to 50
		// do - while will continue until 3 user trails  
		do{
			   
			   trial++;
			   
			   //First trial
			   if(trial ==1)
			   {
			   System.out.println("This is your trial 1. Guess a number to win the lottery!");
			   System.out.println();
			   nextNumber = isInputNumberValid(); //call a function to check if the user has entered a valid integer number
			   }
			   
			   //the while loops runs until the user enters an integer number in the range(0 to 50)
			   while(nextNumber<0 || nextNumber>50)
			   {
				System.out.println("Please enter a number within the range(0 - 50)"); //inform the user to enter a valid integer number
				System.out.println();
				nextNumber = isInputNumberValid(); //call a function to check if the user has entered a valid integer number
			   }
			   
			   if(nextNumber == randomNumber) //if the user input is same as the random number generated
			   {	
				 System.out.println("Hurray! You won the lottery!");
				 System.out.println();
				 System.out.println("Random number generated: "+ randomNumber);
				 System.out.println();
				 System.out.println("Number of trial(s): "+ trial);
				 System.out.println();
				 System.out.println("Would you like to play again? (Y/N)");
				 System.out.println();
				 //handles exception occured while capturing the user input
				 try
				 {
				  ch = (char) System.in.read(); 	 // take the user input
				  // the below do while loop will discard any characters in the input buffer
				  do
				  {
					ignore = (char) System.in.read();
				  }
				  while(ignore != '\n');
				  }
				  catch (IOException e)
				  {
					e.printStackTrace();
				  }
				 break; //comes out of the do while loop because the user has won the game
				}
			   
			   	// If the user failed the first trail, the below code will display appropriate message and take the user input again
				if(trial == 1)
				{
					System.out.println("Alas! Please try again. This is your trial 2!");
					System.out.println();
					nextNumber = isInputNumberValid(); //call a function to check if the user has entered a valid integer number
				}
				else if(trial == 2) // If the user failed the second trail, the below code will display appropriate message and take the user input again
				{
					System.out.println("Bad luck! You got one more trial!");
					System.out.println();
					nextNumber = isInputNumberValid(); //call a function to check if the user has entered a valid integer number
				}
				else if(trial == 3) /* If the user failed the third trail, the below code will display appropriate message
					and will ask the user if he wants to play again */
				{
					System.out.println("Sorry! You lost!");   
					System.out.println();
					System.out.println("Random number generated: "+ randomNumber);
					System.out.println();
					System.out.println("Number of trials: "+ trial);
					System.out.println();
					System.out.println("Would you like to play again? (Y/N)");
					System.out.println();
					try 
					{
					ch = (char) System.in.read(); // take the user input
					 // the below do while loop will discard any characters in the input buffer
					do
					{
						 ignore = (char) System.in.read();	
					}
					while(ignore != '\n');
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
					break;
				}
			  
			  
		   }
		   while(trial<=3);
		
	}
	while(ch == 'Y' || ch == 'y');	// continue the loop only if the user enters Y or y indicating a Yes

	}
	catch(Exception e)
	{
	System.out.println("Please enter a valid integer number");
	}
	}
	
	//the below function checks if the user input is a valid integer number
	private int  isInputNumberValid() {
	    Scanner input = new Scanner(System.in); // reader would be used to capture the user input
	    while (true) 
	    {
	    	try 
	       	{
	            return input.nextInt();   //return the number is valid
	        }
	        catch (java.util.InputMismatchException e)
	    	{
	        	System.out.println("Please enter a valid integer"); //inform the user that the input is invalid
	            input.nextLine();
	        }
	    }
	    
	}
	
	
}
