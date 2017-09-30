import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* This Class will print numbers upto a user defined value
 * For multiples of five it prints “Fizz” instead of the number and for the multiples of 
 * seven it prints “Buzz” instead of the number. For numbers which are multiples of both five and seven, it prints “FizzBuzz"
 */
public class sprabhuHW1 {
   // Main function
	public static void main(String[] args)
	{
		
		//try block is used to check if the code in the block will cast an error
		try{
			// The variable: lastNumber is used to capture the user input for the count of the numbers to be printed
			int lastNumber = 0;
			//Initialize the BufferedReader
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("How many numbers do you want to print:"); // ask the user to enter the numbers he wants to print
			
			//try block is used to check if a valid input is provided
			try
	        {
				lastNumber = Integer.parseInt(br.readLine().trim()); /* readLine takes user input in String format. Hence converting the same to integer
																	The trim function is used to remove the unnecessary spaces if any*/	
				if(lastNumber < 0 || lastNumber == 0)
				{
					System.out.println("You did not enter a positive number"); // Inform the user that a positive number was not entered
				}
	        }
			// catch the NumberFormatException thrown by try block in case the user does not enter a number
			catch(NumberFormatException ex)
		    {
				System.out.println("You did not enter a valid number"); // Inform the user that a valid integer number was not entered
		    }
			 
			/* This for loop will print numbers upto the user provided value which is captured in the variable - lastNumber.
			 * For multiples of five it prints “Fizz” instead of the number and for the multiples of 
			 * seven it prints “Buzz”. For numbers which are multiples of both five and seven, it prints “FizzBuzz"
			 */
			for (int i=1; i<=lastNumber; i++)  // i is an integer variable used to check the divisibility of the number to be displayed.
			{
				if(i%5 == 0 && i%7 == 0) // check for the multiples of both 5 and 7
					{ 
					System.out.print(" "+ "FizzBuzz"); 
					}
				else if (i%5 == 0) // check for the multiples of 5 only
					{
					System.out.print(" "+"Fizz");
					}
				else if(i%7 == 0) // check for the multiples of 7 only
					{
					System.out.print(" "+"Buzz");
					}
					else 
						{
						System.out.print(" "+i); // if any of the above conditions are not satisfied, print the number as is
						}
				
				if(i%10 == 0)
					System.out.println(); // if 10 values have been displayed in a line, this print function will take the control to new line
			}

			br.close(); // closing the BufferedReader after use
			}
		//catch the exception thrown by try block
		catch(IOException e)
			{
			e.printStackTrace(); //display the stack trace
			}

	}
	
}
