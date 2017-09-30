import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* This class exercises some of the String Class utility methods in arriving at final display output.
 */
public class SprabhuHW3 {
//Main Function
public static void main(String[] args)
{
	char ignore ='0'; // char used to discard any other characters in the input buffer
	char ch = 'N';		//Used to store the user input to continue or discontinue with the program
	String option = "0"; //Used to take the user choice to perform the operations
	// This try catch block will handle the exceptions
	try {
	// do - while loop used to take user input as per the options entered
	do
	{
	System.out.println("\nMENU\n");
	System.out.println("Choose one of the below:\n");
	System.out.println(" 1. Read me backwards");
	System.out.println(" 2. Vowel count");
	System.out.println(" 3. Heap up");
	System.out.println(" 4. Spell it out");
	System.out.println(" 5. Compare and case collapse");
	System.out.print(" 6. Split it up\n\n");
	System.out.print("Your choice: ");
	
	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
     option = br1.readLine().trim(); //readLine takes user input in String format and trim it to remove unwanted spaces
    
	
	// option variable will store the user's option
	//option = (String)System.in.read();
	//Check if the user has entered a valid option
	if(option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4") || option.equals("5") || option.equals("6"))
	{
		// Perform the following string operation - Read me backwards – Returns the reverse of the input string (eg: string  -> gnirts )
		if(option.equals("1"))
		{
			// the below do while loop will discard any characters in the input buffer
			do
			{
				ignore = (char) System.in.read();
			}
			while(ignore != '\n');
			System.out.print("\nEnter the string: ");
			// This try catch block will handle the exceptions
			try
		     {
				//Initialize the BufferedReader
		         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		         String input = br.readLine().trim(); //readLine takes user input in String format and trim it to remove unwanted spaces
		         char[] inputArray= input.toCharArray(); // convert the input string to a character array
		         System.out.print("\nResult: ");
		         // this for loop will display the reverse of the original string
		         for (int i=inputArray.length-1;i>=0;i--) 
		            System.out.print(inputArray[i]);
		     }
			 catch(IOException e) 
			 {
		        e.printStackTrace();
		     }
		}
		// Perform the following string operation - Read me backwards – Vowel count – Returns the number of vowels in the input string (eg: Vowel -> 2)
		else if (option.equals("2"))
			{
			do
			{
				ignore = (char) System.in.read();
			} 
			while(ignore != '\n');
			System.out.print("\nEnter the string: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine().trim(); 	//take the user input
            char[] inputArray= input.toCharArray();	
            int vowelCount = 0; //vowelCount will keep a track of the vowels and is being initialized to 0
            // the below for loop will look for vowels in the given string and update the count accordingly
            for (int i = 0; i < inputArray.length ; i++)
    			{
    			  if (inputArray[i]  == 'A' || inputArray[i]  == 'a' )
    				  	vowelCount++;
    			  	else if (inputArray[i]  == 'E' || inputArray[i]  == 'e' )
    			  			vowelCount++;
    			  		else if (inputArray[i]  == 'O' || inputArray[i]  == 'o' )
    			  				vowelCount++;
    			  			else if (inputArray[i]  == 'I' || inputArray[i]  == 'i' )
    			  					vowelCount++;
    			  				else if (inputArray[i]  == 'U' || inputArray[i]  == 'u' )
    			  						vowelCount++;

    			}
            	System.out.print("\nResult: " + vowelCount); // display the above computed count of the vowels in the input string
            }
			/*	Perform the following string operation - Heap up - Given a string and an integer “n”, return a larger string that is n copies of 
			the original string. (eg: See 3 -> SeeSeeSee). */
			else if (option.equals("3"))
			{
				do
				{
				 ignore = (char) System.in.read();
				}
				while(ignore != '\n');
				try
			     {
					
				System.out.println("\nEnter the string: "); //ask the user for the string which is to be heaped up
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String input = br.readLine().trim();
				System.out.println("\nEnter the count(1-5): "); //ask for the number of copies required to displayed
				int numberOfCopies = Integer.parseInt(br.readLine().trim()); // the variable will store the number count provided by the user
					if(numberOfCopies > 0 && numberOfCopies < 6) // check if the user enters the count between 1 to 5
					{
						System.out.print("\nResult: ");
						// the below for loop displayed the required number of copies of the string provided by the user
						for(int i = 0; i <numberOfCopies; i++)
						{
							System.out.print(input);
						}
					}
					else
						System.out.print("\n Only 1 to 5 copies can be displayed"); // inform the user that the input entered is invalid
			     }
				catch(NumberFormatException e)
				{
					System.out.print("Please enter a valid count");
				}
			}
				/*	Perform the following string operation - Spell it out – Given a string like “Java” return the string “JJaJavJava”. */
				else if (option.equals("4"))
				{
					do
					{
					ignore = (char) System.in.read();
					}
					while(ignore != '\n');
					System.out.print("\nEnter the string: ");
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String input = br.readLine().trim();
					char[] inputArray= input.toCharArray();	
					int j = 0; //this variable will be used to display the needed output in the for loop below
					System.out.print("\nResult: ");
					// the for loop displays the required output 
					for(int i = 0; i <=input.length(); i++)
					{
						for(int k = 0; k <= j && j< input.length();k++)
							System.out.print(inputArray[k]);
						j++;
					}
				}
					/* Perform the following string operation - Compare and case collapse – Accept two strings from the user.
					 *  Check if both are the same and if they are different, change the case of the second string and return
					 *  (lower case to upper case and vice versa) or else just return the original string. (eg: night, knight  -> KNIGHT )
					 */
					else if (option.equals("5"))
					{
						do
						{
							ignore = (char) System.in.read();
						}
						while(ignore != '\n');	
						System.out.print("\nEnter the 1st string: ");
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						String input1 = br.readLine().trim();
						System.out.print("\nEnter the 2nd string: ");
						String input2 = br.readLine().trim();
						char[] input2Array= input2.toCharArray(); //will convert the second string to a character array format
						//check if the two strings entered are different(assumption : case-sensitive)
						if(input1.trim().compareTo(input2.trim()) != 0)
							{
							System.out.print("\nResult: ");
							//change the case of the second string and display
							for(int i =0; i< input2Array.length; i++)
							{	
								char c = input2Array[i];
								if (Character.isUpperCase(c))
								{
									System.out.print(Character.toLowerCase(c));
								}
								else if (Character.isLowerCase(c))
								{
									System.out.print(Character.toUpperCase(c));
								}
							}
							}
							else 
								System.out.println("Result: "+input1);  //display the original string
					}
						/* Split it up – Given a string, return the second half of the string if there are even number of characters and return 
							first half if there are odd number of characters */
						else if(option.equals("6"))
						{
							do
							{
								ignore = (char) System.in.read();
							}
							while(ignore != '\n');	
							System.out.println("\nPlease enter the string");
							BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
							String input = br.readLine().trim();
							char[] inputArray1= input.toCharArray();	
							int j = input.length(); // compute the length of the input string
							if(j % 2  == 0) // check if the string are even number of characters
							{
								for(int i = (j/2); i<j; i++)	
									System.out.print(inputArray1[i]); // return the second half of the string if there are even number of characters 
							}
							else //  if the string are odd number of characters
							{
								for(int i = 0; i<=(j/2); i++)	
									System.out.print(inputArray1[i]);	// return first half if there are odd number of characters
							}
						}
		
		System.out.print("\n\nWould you like to continue? (Y/N)"); // the \n\n at the beginning are to display the output in the required format
		ch = (char) System.in.read(); // take the user input
		if(!(ch == 'Y' || ch == 'y' || ch == 'N' || ch == 'n'))
			System.out.println("You did not enter a valid input"); // if the user did not enter a valid option, then give appropriate message & exit
		do
		{
			 ignore = (char) System.in.read();
		}
		while(ignore != '\n');
		}
	else //if the user has not entered a valid choice then inform him and then ask if he wants to continue
	{
		System.out.println("Please enter a valid option");
		do
		{
			ignore = (char) System.in.read();	
		}
		while(ignore != '\n');
		System.out.print("\nWould you like to continue? (Y/N).");
		ch = (char) System.in.read();
		do
		{
			 ignore = (char) System.in.read();	
		}
		while(ignore != '\n');
	}
		
	}
	while(ch == 'Y' || ch == 'y');	// continue the loop only if the user enters Y or y indicating a Yes
	}
catch (IOException e) // catch the io exception
	{
	e.printStackTrace();
	} 
	}
	
}