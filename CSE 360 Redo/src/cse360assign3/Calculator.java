package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	/** This is a constructor that allows for a new value to be calculated from 0.
	*
	* @param none No parameters
	* @return none No return value
	*/
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/** This returns the final value obtained after calculations
	*
	* @param none No parameters
	* @return int returns the total value calculated
	*/
	
	public int getTotal ()
	{
		return total;
	}
	
	/** This adds a number to the current total
	*
	* @param int The value to be added
	* @return none No return value
	*/
	
	public void add (int value)
	{
		total = total + value;
		history = history + " + " + value;
	}
	
	/** This subtracts a number from the current total
	*
	* @param int The value to be subtracted
	* @return none No return value
	*/
	
	public void subtract (int value)
	{
		total = total - value;
		history = history + " - " + value;
	}
	
	/** This multiplies the current total by a number
	*
	* @param int The value to multiply the total by
	* @return none No return value
	*/
	
	public void multiply (int value)
	{
		total = total * value;
		history = history + " * " + value;
	}
	
	/** This divides the current total by a number
	*
	* @param int The value the total will be divided by
	* @return none No return value
	*/
	
	public void divide (int value)
	{
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}

		history = history + " / " + value;
	}
	
	/** This prints the entire history of the calculations done on the total
	*
	* @param none No return value
	* @return String Returns the history of the calculations as a string to see what was done on the total
	*/
	
	public String getHistory ()
	{
		return history;
	}
}
