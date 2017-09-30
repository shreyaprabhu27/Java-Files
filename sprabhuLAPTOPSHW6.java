//This is a class that describes a laptop and hence is derived from the inventory class
public class sprabhuLAPTOPSHW6 extends sprabhuINVENTORYHW6 {
double total_revenue; //used to capture the total revenue from selling the laptops

//default constructor
public sprabhuLAPTOPSHW6() 
{
        super(); //call parent constructor
        total_revenue = 0;
}
  
//parameterized constructor
public sprabhuLAPTOPSHW6( int availability, double price, int no_of_items ) 
{
        super("Laptop", availability, price,no_of_items); //call parent constructor
        total_revenue = 0;
}


//This method calculates the total revenue generated for the items sold
double calcRevenue()
{
	total_revenue = getNo_items_sold()*getItem_price() + 10*getNo_items_sold();
	return total_revenue;
}

//This method updates the quantity of the inventory as per the purchase
public void purchase(int quantity)
{
	if(getAvailability()>=0 && getAvailability()>=quantity) //checks if the quantity available is greater than the quantity purchased
		{
		setNo_items_sold(getNo_items_sold() + quantity);
		System.out.println("Inventory Updated.");
		}
	else
		System.out.println("The quantity available is less than required."); //display appropriate message to the user
}

//This method displays the details for sales, available inventory, items sold and item price for each laptop
public void display()
{
	super.display(); //This will call the method in the parent class(inventory) and display the generic inventory details
	System.out.println("Revenue Generated: $"+calcRevenue() ); //Displays the revenue generated for the laptops
}

}

