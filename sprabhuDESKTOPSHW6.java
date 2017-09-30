//This is a class that describes a desktop and hence is derived from the inventory class
public class sprabhuDESKTOPSHW6 extends sprabhuINVENTORYHW6
{
double total_revenue;

//default constructor
public sprabhuDESKTOPSHW6(){
    super();
    total_revenue = 0;
}

//parameterized constructor
public sprabhuDESKTOPSHW6(int availability, double price, int no_of_items )
{
    super( "Desktop", availability, price, no_of_items);
    total_revenue = 0;
}

//This method calculates the total revenue generated for the items sold
double calcRevenue()
{
	total_revenue = getNo_items_sold()*getItem_price() + 5*getNo_items_sold();
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

//This method displays the details for sales, available inventory, items sold and item price for each desktop
public void display()
{
	super.display(); //This will call the method in the parent class(inventory) and display the generic inventory details
	System.out.println("Revenue Generated: $"+calcRevenue()); //Displays the revenue generated for the desktops
}

}

