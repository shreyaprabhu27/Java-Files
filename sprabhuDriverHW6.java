import java.util.Scanner;
//This class performs operations on the subclasses 
public class sprabhuDriverHW6 {

	public static void main(String[] args) {
		char ignore ='0'; // char used to discard any other characters in the input buffer
		char ch = 'N';		//Used to store the user input to continue or discontinue with the program
		int option = 0; //Used to take the user choice to perform the operations
		
		sprabhuDESKTOPSHW6 desktop= new sprabhuDESKTOPSHW6(30,500,0); //create an object of type sprabhuDESKTOPSHW6
		sprabhuLAPTOPSHW6 laptop = new sprabhuLAPTOPSHW6(50,900,0); //create an object of type sprabhuLAPTOPSHW6
		Scanner input = new Scanner(System.in);
		
		// do - while loop used to take user input as per the options entered
		do
		{
		System.out.println("\nMENU\n");
		System.out.println("1. Update Inventory on Sale\n");
		System.out.println("2. Calculate Revenue\n");
		System.out.println("3. Number of Items in stock\n");
		System.out.println("4. Summary\n");
		System.out.print("Your choice: ");
		
		option = isInputNumberValid(); //call a function to check if the user has entered a valid integer number
		
		while(option<=0 || option>4)
		   {
			System.out.println("Please enter a valid option(1 - 4)"); //inform the user to enter a valid option
			option = isInputNumberValid(); //call a function to check if the user has entered a valid integer number
		   }
		   	
		//Execute code as per the user option
		switch(option) {
	     case 1:
	     {
	    	 int choice = 0, quantity;//used to capture the item type and quantity
	    	 System.out.println("\nWhat was sold?\n\n1. Laptop\n2. Desktop");
	    	 System.out.println("\nYour choice:");
	    	 choice = isInputNumberValid(); //take the user choice
	    	 while(choice != 1 && choice != 2)
			   {
				System.out.println("Please enter a valid choice"); //inform the user to enter a valid option
				choice = isInputNumberValid(); 
			   }
	    	 if(choice == 1) //relevant to laptop
	    		 {
	    		 if(laptop.getAvailability()==0) //check if there is no inventory available
	    			 System.out.println("There is no stock available at present."); //display appropriate message to the user
	    		 else //if the inventory is available, then update it
	    		 {
	    			 System.out.println("Please enter the quantity sold.");
	    			 System.out.println("Quantity: ");
	    			 quantity = isInputNumberValid(); //read the quantity to be purchased and check if it is a valid integer number
	    			 laptop.purchase(quantity); //update the inventory 
	    		 }
	    		 }
	    	 if(choice == 2) //relevant to desktop
	    	 	{
	    		if(desktop.getAvailability()==0) //check if there is no inventory available
	    			 System.out.println("There is no stock available at present."); //display appropriate message to the user
	    		else //if the inventory is available, then update it
	    		{
	    			System.out.println("Please enter the quantity sold.");
	    			System.out.println("Quantity: ");
	    	 		quantity = isInputNumberValid(); //read the quantity to be purchased and check if it is a valid integer number
	    	 		desktop.purchase(quantity); //update the inventory
	    	 	}
	    	 	}	 
	     }	 
	     break;
	    	 case 2:
	    	 {
	    		 int choice = 0;
		    	 System.out.println("\n1. Laptop\n2. Desktop");
		    	 System.out.println("Your choice:");
		    	 choice = isInputNumberValid(); //take the user choice
		    	 while(choice != 1 && choice != 2)
				   {
					System.out.println("Please enter a valid choice"); //inform the user to enter a valid option
			    	 choice = isInputNumberValid(); //take the user choice
				   }
		    	 if(choice == 1) //relevant to laptop
		    		{
		    		 System.out.println("Revenue generated for Laptops: "+ laptop.calcRevenue());
		    		}	   
		    	 if(choice == 2) //relevant to desktop
		    	 	{
		    		System.out.println("Revenue generated for Desktops: "+ desktop.calcRevenue());
		    	 	}
	    	 }
	    break;
	    	 case 3:
	    	 {
	    		 int choice = 0;
		    	 System.out.println("\n1. Laptop\n2. Desktop");
		    	 System.out.println("Your choice:");
		    	 choice = isInputNumberValid(); //take the user choice
		    	 while(choice != 1 && choice != 2)
				   {
					System.out.println("Please enter a valid choice"); //inform the user to enter a valid option
			    	 choice = isInputNumberValid(); //take the user choice
				   }
		    	 if(choice == 1) //relevant to laptop
		    	 	{
		    		 System.out.println("Number of items in the stock "+ laptop.getAvailability());
		    		}
		    	 if(choice == 2) //relevant to desktop
		    	 	{
		    		System.out.println("Number of items in the stock "+ desktop.getAvailability());
		    	 	}
	    	 }
	    	 break;
	    	 case 4:
	    		 laptop.display(); //display inventory details of laptop
	    		 desktop.display(); //display inventory details of desktop 
	    		 break;
		}
		
		// This try catch block will handle the exceptions
		try
		{
		System.out.print("\nWould you like to continue? (Y/N)."); //ask if the user wants to continue with the transactions
		ch = (char) System.in.read(); //captures user choice
		do
		{
			 ignore = (char) System.in.read();	//removes unwanted characters from the buffer
		}
		while(ignore != '\n');
		}
		catch(Exception e)
		{
		System.out.println("You did not enter a valid option");	
		}
		}
		while(ch == 'Y' || ch == 'y');	// continue the loop only if the user enters Y or y indicating a Yes
		input.close();
	}
	
	static int  isInputNumberValid() 
	{
	    Scanner input = new Scanner(System.in); // reader would be used to capture the user input
	    while (true) 
	    {
	    	try 
	       	{
	            return input.nextInt();   //return the number if it is valid
	        }
	        catch (java.util.InputMismatchException e)
	    	{
	        	System.out.println("Please enter a valid integer."); //inform the user that the input is invalid
	            input.nextLine();
	        }
	    }
	
}
	
}


