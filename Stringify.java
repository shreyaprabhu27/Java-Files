import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stringify {

public static void main(String[] args)
{
	
	char ch = 'Y';
	do
	{
	char option;
	char ignore;
	try {
	System.out.println("MENU\n");
	System.out.println("Choose one of the below:\n");
	System.out.println(" 1. Read me backwards");
	System.out.println(" 2. Vowel count");
	System.out.println(" 3. Heap up");
	System.out.println(" 4. Spell it out");
	System.out.println(" 5. Compare and case collapse");
	System.out.print(" 6. Split it up\n");
	
		option = (char)System.in.read();
		System.out.println("option "+ option);
		//if(option!= '1' || option!= '2' || option!= '3' || option!= '4' || option!= '5' || option!='6')
		{
		if(option == '1')
		{
			System.out.println("Your choice: "+(char)option);
			do {
				 ignore = (char) System.in.read();
				
			} while(ignore != '\n');
			//String originalString = "";
			System.out.println("\nEnter the string");
			 try
		        {
		            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		            String input = br.readLine();
		            char[] inputArray= input.toCharArray();
		            System.out.print("Result: ");
		            for (int i=inputArray.length-1;i>=0;i--)
		            	System.out.print(inputArray[i]);
		        }
		        catch (IOException e) {
		            e.printStackTrace();
		        }
			}
		else if (option == '2')
		{
			System.out.println("Your choice: "+(char)option);
			do {
				 ignore = (char) System.in.read();
				
			} while(ignore != '\n');
			System.out.println("Please enter the string");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            char[] inputArray= input.toCharArray();	
            int vowelCount = 0;
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
            	System.out.println("Result: " + vowelCount);
            }
			
		else if (option == '3')
		{
			System.out.println("Your choice: "+(char)option);
			do {
				 ignore = (char) System.in.read();
				
			} while(ignore != '\n');
			//String originalString = "";
			System.out.println("Please enter the string");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           String input = br.readLine();
           System.out.println("Please enter the number of copies(0-5)");
			int numberOfCopies = Integer.parseInt(br.readLine().trim());
			
			if(numberOfCopies > 0 || numberOfCopies < 6)
			{
				System.out.print("Result: ");
				for(int i = 0; i <numberOfCopies; i++)
			{
				System.out.print(input);
			}
			}
			else
				System.out.print("Maximum of 5 copies can be displayed");
          	
		}
		else if (option == '4')
		{
			System.out.println("Your choice: "+(char)option);
			do {
				 ignore = (char) System.in.read();
				
			} while(ignore != '\n');
			//String originalString = "";
			System.out.print("\nEnter the string: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			char[] inputArray= input.toCharArray();	
			int j = 0;
			System.out.print("\nResult: ");
			for(int i = 0; i <=input.length(); i++)
			{
				for(int k = 0; k <= j && j< input.length();k++)
					System.out.print(inputArray[k]);
				j++;
			}
			}
		else if (option == '5')
		{
			System.out.println("Your choice: "+(char)option);
			do {
				 ignore = (char) System.in.read();
				
			} while(ignore != '\n');	
			System.out.println("Please enter the string");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input1 = br.readLine();
			System.out.println("Please enter the string");
			String input2 = br.readLine();
			char[] inputArray2= input2.toCharArray();
			
			if(input1.trim().compareTo(input2) != 0)
				{
				System.out.print("Result: ");
				for(int i =0; i< inputArray2.length; i++)
				{	char c = inputArray2[i];
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
				System.out.println("Result: "+input1);
		}
		else if(option == '6')
		{
			System.out.println("Your choice: "+(char)option);
			do {
				 ignore = (char) System.in.read();
				
			} while(ignore != '\n');	
			
			System.out.println("Please enter the string");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine().trim();
			char[] inputArray1= input.toCharArray();	
			int j = input.length();
			if(j % 2  == 0)
			{
			for(int i = (j/2); i<j; i++)	
				System.out.print(inputArray1[i]);
			}
			else
			{
			for(int i = 0; i<=(j/2); i++)	
				System.out.print(inputArray1[i]);	
			}
		}
		}
		/*else
		{
			System.out.println("Please enter a valid option");
		}*/	
		
		System.out.println("Would you like to continue? (Y/N)");
		ch = (char) System.in.read();
		System.out.println("char "+ch);
	}
	catch (IOException e)
	{
	e.printStackTrace();
	} 
	System.out.println("char "+ch);	
}
while(ch == 'Y' || ch == 'y');	
}
}