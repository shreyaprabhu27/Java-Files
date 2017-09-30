import java.io.*;

public class ShreyaPrabhu1 {

	public static void main(String[] args)
	{
		
		/* Declaring and Initializing variables to capture the First name, Last name, Flight Number, Port of Arrival,
		Port of Departure, Country, Passport Number, CountryCode of the User */
		String firstName = "", lastName = "", flightNumber = "", portOfDeparture = "", portOfArrival = "", country = "", passportNumber = "", countryCode = "";
		
		// Declaring and Initializing variables to capture the date of Birth and Age of the User 
		int date = 0, month = 0, year = 0, age = 0;
		
		/* Declaring and Initializing the variable to capture the phone number of the user. The datatype taken in long since
		int range would not be sufficient */
		long phoneNumber = 0;
		
		//try block is used to check if the code in the block will cast an error
		try{
		
		//Initialize the BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your first name:"); // ask the user to enter the first name
		firstName = br.readLine(); //readLine takes user input in String format
		
		System.out.println("Enter your last name:"); 
		lastName = br.readLine();
		
		System.out.println("Enter the date on which you were born(in dd format):"); // ask the user to enter the date on which he/she was born
		date = Integer.parseInt(br.readLine()); //Convert string to Integer by using parseInt function since the default input is String
		
		System.out.println("Enter the month in which you were born(in mm format):");
		month = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the year in which you were born(in yyyy format):");
		year = Integer.parseInt(br.readLine());
		
		age = 2016 - year; // Calculating the age of the user
		
		System.out.println("Enter your country code:");
		// Reading the country Code as a String as int might hide the preceding zeroes in the code e.g. 001 would be displayed as 1
		countryCode = br.readLine(); 
			
		System.out.println("Enter your phone number:");
		phoneNumber = Long.parseLong(br.readLine()); //Convert string to long by using parseLong function since the default input is String
		
		System.out.println("Enter your port of Departure:");
		portOfDeparture = br.readLine();
		
		System.out.println("Enter your port of Arrival:");
		portOfArrival = br.readLine();
		
		System.out.println("Enter your flightNumber:");
		flightNumber = br.readLine();
	
		System.out.println("Enter your country of residence:");
		country = br.readLine();
	
		System.out.println("Enter your passport number:");
		passportNumber = br.readLine();
		
		
		//display the user entered details and the calculated age
		
		System.out.println("\nPASSENGER INFORMATION");
		System.out.println(firstName + " "+ lastName + "\t\t\tAge: "+ age);
		System.out.println("Passport No: "+ passportNumber + "\t\t" + country);
		System.out.println(flightNumber+ "\t\t\t\t" + portOfArrival + " - "+ portOfDeparture );
		System.out.println("Contact Information: "+ countryCode + " "+ phoneNumber);
		
		br.close(); // closing the BufferedReader after use
		}
		//catch the exception thrown by try block
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
}
