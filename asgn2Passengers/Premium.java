package asgn2Passengers;


/**
 * This class is used to represent the characteristics of a booking process of Premium Class Passenger
 *
 * This is class subclass of Passenger class, so this class can use all methods and variable 
 * of Passenger Class
 * @author CAB302
 * @version 1.0
 */


public class Premium extends Passenger
{
	/**
	 * 	Premium(int,int) constructor of this Premium class, this constructor check set new booking and departure Time 
	 *  of any Passenger
	 */
	public Premium(int bookingTime,
		       int departureTime)
		        throws PassengerException
		        {
		
		        }

	/**
	 * This is no-argument Premium() constructor
	 */
	protected Premium()
	{
		
	}
	
	/**
	 *  This method is override from Passenger Class, this method call when no seat available
	 */
	@Override
	String noSeatsMsg() {
		// TODO Auto-generated method stub
		return "no seats available";
	}

	/**
	 *  This method is also override from Passenger Class, this method upgrade passenger information if any 
	 *  change in booking system
	 */
	@Override
	Passenger upgrade() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
