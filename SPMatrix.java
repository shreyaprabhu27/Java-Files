//Shreya Prabhu

import java.util.Random; //import Random class to implement the random number generation logic
// this class represents a matrix and provides methods for operations that can be performed on it
public class SPMatrix {
	//rows in the matrix, initialized through the constructor. The variable is private so it can't be accessed directly outside the class
	 int rows; 
	//columns in the matrix, initialized through the constructor. The variable is private so it can't be accessed directly outside the class
	 int columns; 
	//two-dimensional array that represents the matrix
	private int matrix[][]; 
	static int a;
	float r;
	SPMatrix(int r, int c)
	{
		rows = r;
		columns = c;
	
	}
	//constructor with two parameters
	/*SPMatrix(int r, int c)
	{
	if(r<1)
		this.rows = 1; // if the row parameter less than 1, the number would be default to 1
	else if(r>5)
		this.rows = 5; // if the row parameter greater than than 5, the number would be default to 5
		else 
		this.rows = r; // if the row parameter(0<n<6), then assign the parameter value as is

	if(c<1)
		this.columns = 1; // if the column parameter less than 1, the number would be default to 1
	else if(c>5)
		this.columns = 5; // if the column parameter greater than than 5, the number would be default to 5
		else 
		this.columns = c; // if the column parameter(0<n<6), then assign the parameter value as is
	
	create_matrix(); // post assignment of rows and columns, call function to create a matrix
	}
	
	//constructor with single parameter
	SPMatrix(int d)
	{
		this(d, d);	//call another constructor with same number of rows and columns as parameters
	}
	*/
	// function to create the matrix
	void create_matrix()
	{
		matrix = new int[rows][columns]; //create a two-dimensional array named matrix
		for(int i=0; i< rows ; i++) 
		{
			for(int j=0; j< columns; j++)
			{
				matrix[i][j] = getRandomNumberInRange();//call a function to generate a random number and assign it to array
			}
		}
		
	}
	
	//function to display the matrix
	void displayMatrix()
	{
		for(int i = 0; i < rows; i++)
		{
			for(int j =0; j <columns; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println(" "); //start printing from the next line
		}
		System.out.println();
	}
	
	//generate random numbers within the range -10 to 10
	int getRandomNumberInRange() {
		Random r = new Random(); //instance of the object Random created
		//return r.nextInt((max - min) + 1) + min will provide a random number within the range(min to max) in this case -10 to 10
		return r.nextInt(21)-10; 
	}
	
	//return the number of rows for the matrix object
	int getNumOfRows()
	{
		return this.rows;
	}
	
	 //return the number of columns for the matrix object
	int getNumOfColumns()
	{
		return this.columns;
	}
	
	//function to display the maximum value in the row
	int getRowMax(int n)
	{		
		int rowMax = 0; //stores the maximum value of the row; initialized to 0 before the calculation
		int rowIndex = n-1; //rowIndex is assigned the index of the row to be considered 
		
		if(n>this.rows || n<1) //validate if the row number is valid
			{
			System.out.println("Please enter a valid value for row.");
			return -1; //return -1 in case of error
			}
		else //if the input is valid, then return the maximum value in the row
		{
			for (int i = 0; i < columns; i++)
			{
        	  if(matrix[rowIndex][i] > rowMax)
        		  rowMax = matrix[rowIndex][i];
			}
			
		return rowMax; //return the maximum value in the row
		}
	}
	
	//function to derive the sum of the values in a particular column
	int getColumnSum(int n)
	{
		int columnSum = 0; //stores the columnSum; initialized to 0 before the calculation
		int columnIndex = n-1; //columnIndex is assigned the index of the column to be considered 
		if(n>this.columns || n<1) //validate if the column number is valid
			{
			System.out.println("Please enter a valid value for column.");
			return -1; //return -1 in case of error
			}
		else //if the input is valid, then return the sum of the values in the column
		{
			for (int i = 0; i < rows; i++)
			{
				columnSum += matrix[i][columnIndex];
			}
			return columnSum; //return the sum of value in column
		}
	}
	
	//function to add two matrices
	SPMatrix addMatrices(SPMatrix m1)
	{
		//create an object of type SPMatrix and allocating it the same size as that of the calling matrix 
		SPMatrix resultMatrix = new SPMatrix(this.getNumOfRows(),this.getNumOfColumns());
		SPMatrix m = m1; //assign the parameter matrix to new matrix m
		//check if addition can be performed
		if(this.getNumOfRows() == m.getNumOfRows() && this.getNumOfColumns() == m.getNumOfColumns())
		{
		for (int i = 0; i < rows; i++)
			{
	           for (int j = 0; j < columns; j++)
	           {
	        	   resultMatrix.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
	           }
			}
		return resultMatrix; //return the result Matrix
		}
		else 
			{//inform the user of the mismatch in the number of rows & columns
			System.out.println("The number of rows or columns of the input matrices do not match"); 
			System.out.println(); // bring the control to the next line so the next output looks systematic
			return null; //return null if any error, exception handling has to be done in the main method
			}
	}
	
	//function to subtract two matrices
	SPMatrix subtractMatrices(SPMatrix m1)
	{
		//create an object of type SPMatrix and allocating it the same size as that of the calling matrix
		SPMatrix resultMatrix = new SPMatrix(this.getNumOfRows(),this.getNumOfColumns());
		SPMatrix m = m1; //assign the parameter matrix to new matrix m
		
		//check if subtraction can be performed
		if(this.getNumOfRows() == m.getNumOfRows() && this.getNumOfColumns() == m.getNumOfColumns())
		{
		for (int i = 0; i < rows; i++)
			{
	           for (int j = 0; j < columns; j++)
	           {
	        	   resultMatrix.matrix[i][j] = this.matrix[i][j] - m.matrix[i][j];
	           }
			}
		return resultMatrix;
		}
		else 
		{//inform the user of the mismatch in the number of rows & columns
			System.out.println("The number of rows or columns of the input matrices do not match");
			System.out.println(); // bring the control to the next line so the next output looks systematic
			return null; //return null if error, exception handling has to be done in the main method
		}
	}
	
	//function to perform of transpose of a matrix
	SPMatrix getTranposeMatrix()
	{
		/* create an object of type SPMatrix having the number of rows = number of columns
		of the original matrix and number of columns = number of rows of the original matrix */
		SPMatrix resultMatrix = new SPMatrix(this.getNumOfRows(),this.getNumOfColumns());
		
		for (int i = 0; i < rows; i++)
			{
	           for (int j = 0; j < columns; j++)
	           {
	        	   resultMatrix.matrix[j][i] = this.matrix[i][j];
	           }
			}
		return resultMatrix; //return resultMatrix
	}

	
}
