// This class will display the GPA of a person by taking the course units and grades for 3 courses through command line arguments
public class GPACalculator
{
	
	 // Main function
	public static void main(String[] args) 
	{
		//studentGrade is an Integer Array &  will store the course units & grades as provided by the user. 
		int studentGrade[][] = new int[3][2];
		/* integer k will be used to traverse through the parameter array args[]. It is initialized to 1 in 
		order to considered only the grade and course units which would be seen further */
		int k = 1;
		// The string formattedGPA would be used to to store the GPA in the format to be displayed to the user
		String formattedGPA = "";
		//The below code would be executed only when the users provides the right number of inputs(7)
		if(args.length == 7)
		{	
			// This try catch block will handle the exceptions
			try
			{
				// The below for loops will store the values of the args[] array into the studentGrade array
				for(int i =0; i< 3; i++)
				{	
					for(int j = 0 ; j< 2; j++)
					{	
						studentGrade [i][j] = Integer.parseInt(args[k++]);
					}	
				}
				
				/* Calling a function to validate if the user has provided valid grades and course units. The result of validation will be captured in
				the boolean  variable validationResult */
				boolean validationResult = validate(studentGrade);
				
				/* This block will calculate the GPA only after confirming that the users inputs are correct and hence will executed be 
				only when the validationResult if true. */
				if(validationResult)
				{
				// handling the divide by zero error
				if((studentGrade [0][0] + studentGrade [1][0] + studentGrade [2][0]) != 0)
				{
					//calculate the GPA
					double GPA = (double)(studentGrade [0][0]*studentGrade [0][1] + studentGrade [1][0]*studentGrade [1][1] + studentGrade [2][0]*studentGrade [2][1])/ (studentGrade [0][0] + studentGrade [1][0] + studentGrade [2][0]);
					// round the GPA to 2 decimal digits for display purpose
					formattedGPA = String.format("%.2f", GPA);			
				}
				
				// display the GPA of the user
				System.out.println(args[0]+ " GPA is: " + formattedGPA);	
		
				}
			}
			catch(NumberFormatException e) // catch the NumberFormatException thrown by the try block
			{
				System.out.println("The course units and grades should be valid numbers.Grades can have only the following values - 2,3,4. Course units can have only the following values - 1,2,3,4. Please try again");
			}
			catch(Exception e) // catch any other Exception thrown by the try block
			{
				e.printStackTrace();
			}
		}
		else 	
			System.out.println("Please provide exact 7 inputs in the Sequence - 'your Name' 'Course1 Units' 'Course1 Grades' 'Course2 Units' 'Course2 Grades' 'Course3 Units' 'Course3 Grades'.");	
		}
	
	//function to validate if the user has provided valid grades and course units
	static boolean validate(int studentGrade[][])
	{
		// storing the argument array to a local array GradeValidate
		int GradeValidate[][] = studentGrade;
		/* flag1 declared for course unit validation & flag2 declared for grade validation. These flags will be 
		used to display appropriate error message to the user */
		int flag1 = 0, flag2 = 0;
		// status will capture the details post validation. It will be changed to value - false of the input is invalid
		boolean status = true;
		
		// This for loop will validate if appropriate course units are entered (1 to 4) 
		for(int i = 0; i < 3; i ++)
		{
			if(GradeValidate[i][0]<1 || GradeValidate[i][0]>4)
			{
				flag1 = 1;
				status = false; 
			}
		}
		// This for loop will validate if appropriate grades are entered (2 to 4)
		for(int i = 0; i < 3; i ++)
		{
			if(GradeValidate[i][1]<2 || GradeValidate[i][1]>4)
			{
				flag2 = 1;
				status = false;
			}
		}	
		
		if (flag1 == 1 && flag2 ==1 ) // Display error message if the user has entered invalid values for both grades and course units 
			{
				System.out.println("Grades can have only the following values - 2,3,4. Course units can have only the following values - 1,2,3,4. Please try again");
			}
			else if(flag1 == 1) // Display error message if the user has entered invalid values for course units
				{
					System.out.println("Course units can have only the following values - 1,2,3,4. Please try again");
				}
				else if(flag2 ==1) // Display error message if the user has entered invalid values for grades
				{
					System.out.println("Grades can have only the following values - 2,3,4. Please try again");
				}
		return status; // Return true if all the input values are appropriate else return false
	}
	
}
		
